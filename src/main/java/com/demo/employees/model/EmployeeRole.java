package com.demo.employees.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class EmployeeRole {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "employee_id")
    private Long employeeId;

}
