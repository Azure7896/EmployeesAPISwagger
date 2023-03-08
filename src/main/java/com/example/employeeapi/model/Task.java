package com.example.employeeapi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private Long taskName;
    private int timeToCompleteInHours;
    private double salary;

    @ManyToMany (fetch = FetchType.EAGER)
    private List<Employee> employeeList;

}
