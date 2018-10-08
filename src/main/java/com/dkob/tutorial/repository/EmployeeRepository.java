package com.dkob.tutorial.repository;

import com.dkob.tutorial.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
