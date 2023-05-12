package com.example.humanresorce.Employee.domain;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table(name="address")
public class Address {
    @Id
    @SequenceGenerator(name="address_sequence",
            sequenceName = "address_sequence", initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "address_sequence")
    private Long id;
    private String street_name;
    private String zipcode;
    private String aptNumber;
    private String city;
    private String state;
}
