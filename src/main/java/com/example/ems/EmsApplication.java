package com.example.ems;

import com.example.ems.employee.Employee;
import com.example.ems.employee.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmsApplication.class, args);
    }

    /*@Bean
    CommandLineRunner runner(EmployeeRepository employeeRepository){
        return args -> {
            List<Employee> list = new ArrayList<>();

            Employee employee = new Employee(
                    "rushali@gmail.com",
                    "Rushali Patel",
                    "Marketing");
            list.add(employee);

            employee = new Employee(
                    "arinma@gmail.com",
                    "Arin Agrawal",
                    "Chemical");
            list.add(employee);

            employee = new Employee(
                    "priyanshi@gmail.com",
                    "Priyanshi Agrawal",
                    "IT");
            list.add(employee);

            employeeRepository.saveAll(list);
        };

    }*/
}
