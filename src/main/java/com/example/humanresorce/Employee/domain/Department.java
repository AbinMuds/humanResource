package com.example.humanresorce.Employee.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class Department {

    @Id
    @SequenceGenerator(name="department_sequence",
            sequenceName = "department_sequence", initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "department_sequence")
    private long id;
    private String department_name;
    private String department_code;
}
