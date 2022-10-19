package com.example.registrationservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int experience;
    private String domain;
}
