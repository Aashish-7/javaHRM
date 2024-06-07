package com.hrm.javaHRM.employee.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "UUID")
    private UUID employeeId;

    @Embedded
    private PersonalDetails personalDetails;

    @Embedded
    private ContactDetails contactDetails;

    @ElementCollection
    private List<EmergencyContactDetails> emergencyContacts;

    @ElementCollection
    private List<DependentDetails> dependents;

    @Embedded
    private ImmigrationDetails immigration;

    @Embedded
    private JobDetails job;

    @Embedded
    private SalaryDetails salary;

    @Embedded
    private ReportingMembers reportTo;

    @ElementCollection
    private List<QualificationDetails> qualifications;
}
