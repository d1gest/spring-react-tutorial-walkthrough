package com.dkob.tutorial.config;

import com.dkob.tutorial.domain.Employee;
import com.dkob.tutorial.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}