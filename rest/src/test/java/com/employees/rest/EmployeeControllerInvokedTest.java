package com.employees.rest;

import com.employees.MockConfigEmployee;
import com.employees.domain.model.Employee;
import com.employees.rest.controller.EmployeeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MockConfigEmployee.class})
public class EmployeeControllerInvokedTest {

    @Autowired
    EmployeeController employeeController;

    @Test
    public void isEmployeeControllerInvoked(){

        Mockito.verify(employeeController,Mockito.times(0)).getEmployee(100L);

        Employee emp = employeeController.getEmployee(100L);
        Mockito.verify(employeeController,Mockito.times(1)).getEmployee(100L);
    }


}
