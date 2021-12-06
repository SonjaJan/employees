package com.demo.employees.repository;

import com.demo.employees.model.EmployeeRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRoleRepository extends JpaRepository<EmployeeRole, Long> {
}
