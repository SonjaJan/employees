package com.demo.employees.controller;

import com.demo.employees.model.EmployeeRole;
import com.demo.employees.repository.EmployeeRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    public EmployeeRoleRepository repository;

    @GetMapping("/roles")
    public List<EmployeeRole> getAllRoles() {
        System.out.println("Getting all roles...");
        return repository.findAll();
    }

    @PostMapping("/roles/newrole")
    public void addRole(@RequestBody EmployeeRole employeeRole) {
        EmployeeRole empRole = EmployeeRole.builder().
                                    roleName(employeeRole.getRoleName()).
                                    employeeId(employeeRole.getEmployeeId()).
                                    build();
        repository.save(empRole);
    }
}
