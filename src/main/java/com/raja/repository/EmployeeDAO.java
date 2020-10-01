package com.raja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raja.model.Employee;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

}
