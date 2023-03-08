package com.example.employeeapi.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String firstName;
    private String lastName;
    private String birthDate;
    private String employeeWorkplace;
}
