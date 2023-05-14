package com.example.humanresorce.domain;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table(name="department")
public class Department {

    @Id
    @SequenceGenerator(name="department_sequence",
            sequenceName = "department_sequence", initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "department_sequence")
    private long id;
    private String department_name;
    private String department_code;
}
