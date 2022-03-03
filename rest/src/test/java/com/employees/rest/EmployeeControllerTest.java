package com.employees.rest;

import com.employees.MockConfigEmployee;
import com.employees.domain.model.Employee;
import com.employees.domain.model.EmployeeRole;
import com.employees.domain.repository.EmployeeRepository;
import com.employees.rest.controller.EmployeeController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MockConfigEmployee.class})
public class EmployeeControllerTest {

    @Autowired
    public EmployeeRepository repository;
    @Autowired
    public Employee employee;
    @Autowired
    private EmployeeController employeeController;

    @Test
    public void retrieveDetailsForEmployee() {

        Employee employee = new Employee(100L, "Sonja", "Jan",
                Arrays.asList(new EmployeeRole(100L, "Developer", "McKesson")));

        Mockito.when(employeeController.getEmployee(100L))
                .thenReturn(employee);

        Employee emp = employeeController.getEmployee(100L);

        Assert.assertEquals(employee, emp);
    }

}

