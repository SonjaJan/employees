package com.demo.employees;

import com.demo.employees.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EmployeesApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	}
}
