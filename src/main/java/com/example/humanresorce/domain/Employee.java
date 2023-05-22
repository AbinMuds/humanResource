package com.example.humanresorce.domain;
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
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Temporal(TemporalType.DATE)
    private Date hireDate;

}
