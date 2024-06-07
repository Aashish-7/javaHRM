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
public class ImmigrationDetails {

    private String passportNumber;
    private String visaType;
    private Date expiryDate;
}
