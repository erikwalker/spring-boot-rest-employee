package com.springboot.rest.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.employee.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}