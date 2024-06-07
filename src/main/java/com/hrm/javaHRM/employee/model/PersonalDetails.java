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
public class PersonalDetails {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String maritalStatus;
    private String nationality;
    private int age;
}
