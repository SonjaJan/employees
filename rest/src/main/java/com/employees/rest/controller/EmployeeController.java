package com.employees.rest.controller;

import com.employees.domain.model.Employee;
import com.employees.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class EmployeeController {

    @Autowired
    public EmployeeRepository repository;

    @GetMapping("/employees/bynamewithquery/{name}")
    public List<Employee> findEmployeeByNameWithQuery(@PathVariable("name") String name) {
        return repository.findEmployeeByNameWithQuery(name);
    }

    @GetMapping("/employees/byname/{name}")
    public List<Employee> findEmployeeByName(@PathVariable("name") String name) {
        return repository.findEmployeeByFirstName(name);
    }


    @GetMapping("/employees")
    public List<Employee> all() {
        System.out.println("Getting all employees...");
        return repository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/employees/newemployee")
    public void saveEmployee(@RequestBody Employee employee) {
        repository.save(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee emp = repository.findById(id).get();
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setRoles(employee.getRoles());
        repository.save(emp);
    }
}
