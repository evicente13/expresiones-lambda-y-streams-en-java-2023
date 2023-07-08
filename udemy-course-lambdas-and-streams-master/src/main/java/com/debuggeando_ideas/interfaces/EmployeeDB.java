package com.debuggeando_ideas.interfaces;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements DatabaseService<Employee>{
    @Override
    public Employee getById(Long id) {
        Employee e = new Employee();
        e.setDni(UUID.randomUUID().toString());
        e.setName("Eduardo");
        e.setSalary(1594.00);
        return e;
    }

    @Override
    public List<Employee> getAllRecords() {
        return null;
    }
}
