package com.employees.main;

import com.employees.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.employees.rest.controller")
@EnableAutoConfiguration
@EnableTransactionManagement
@EntityScan("com.employees.domain.model")
@SpringBootApplication(scanBasePackages = {"com.employees"})
@EnableJpaRepositories("com.employees.domain")
public class EmployeesApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeesApplication.class, args);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }
}
