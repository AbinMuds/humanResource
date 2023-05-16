package com.example.humanresorce.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name="account")
public class Account {
    @Id
    @SequenceGenerator(name="account_sequence",
            sequenceName = "account_sequence", initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "account_sequence")
    private Long id;
    private String bankName;
    private String routingNumber;
    private String accountNumber;
}
