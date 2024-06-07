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
public class ContactDetails {

    private String address;
    private String city;
    private String country;
    private String email;
    private String phone;
}
