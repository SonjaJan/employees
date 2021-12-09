package com.demo.employees.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "project_name")
    private String projectName;

    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

}
