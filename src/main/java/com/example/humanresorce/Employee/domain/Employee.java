package com.example.humanresorce.Employee.domain;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @SequenceGenerator(name="employee_sequence",
            sequenceName = "employee_sequence", initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "employee_sequence")

    private long id;
    private String first_name;
    private String last_name;
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Temporal(TemporalType.DATE)
    private Date hireDate;

}