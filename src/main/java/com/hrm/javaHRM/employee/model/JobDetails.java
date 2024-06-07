package com.hrm.javaHRM.employee.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobDetails {

    private String position;
    private String department;
    private Date hireDate;
}
