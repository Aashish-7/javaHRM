package com.hrm.javaHRM.employee.service;

import com.hrm.javaHRM.employee.model.Employee;
import com.hrm.javaHRM.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(UUID id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(UUID id, Employee employeeDetails) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            employee.setPersonalDetails(employeeDetails.getPersonalDetails());
            employee.setContactDetails(employeeDetails.getContactDetails());
            employee.setEmergencyContacts(employeeDetails.getEmergencyContacts());
            employee.setDependents(employeeDetails.getDependents());
            employee.setImmigration(employeeDetails.getImmigration());
            employee.setJob(employeeDetails.getJob());
            employee.setSalary(employeeDetails.getSalary());
            employee.setReportTo(employeeDetails.getReportTo());
            employee.setQualifications(employeeDetails.getQualifications());
            return employeeRepository.save(employee);
        }
        return null;
    }

    public void deleteEmployee(UUID id) {
        employeeRepository.deleteById(id);
    }
}
