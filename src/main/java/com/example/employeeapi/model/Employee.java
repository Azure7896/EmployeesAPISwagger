package com.example.employeeapi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String employeeWorkplace;


    public Employee(String firstName, String lastName, String birthDate, String employeeWorkplace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.employeeWorkplace = employeeWorkplace;
    }
}
