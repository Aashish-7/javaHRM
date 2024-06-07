package com.hrm.javaHRM.employee.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QualificationDetails {

    private String degree;
    private String institution;
    private int year;
}
