package com.example.ems.employee;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long employeeID;

    public String email;
    public String employeeName;
    public String department;


    public Employee(String email, String employeeName, String department) {
        this.email = email;
        this.employeeName = employeeName;
        this.department = department;
    }
}
