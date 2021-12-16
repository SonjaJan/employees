package com.employees.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

}
