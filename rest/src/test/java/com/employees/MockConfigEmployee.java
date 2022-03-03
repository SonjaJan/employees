package com.employees;

import com.employees.domain.model.Employee;
import com.employees.domain.repository.EmployeeRepository;
import com.employees.rest.controller.EmployeeController;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockConfigEmployee {
    @Bean
    public EmployeeRepository employeeRepository() {
        return Mockito.mock(EmployeeRepository.class);
    }
    @Bean
    public EmployeeController employeeController() {
        return Mockito.mock(EmployeeController.class);
    }
    @Bean
    public Employee employee() {
        return Mockito.mock(Employee.class);
    }
}
