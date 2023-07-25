package com.mapsa.Lesson.service;

import com.mapsa.Lesson.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    public List<EmployeeEntity> getEmployee();

    public EmployeeEntity getById(Long id);

    public EmployeeEntity createEmployee(EmployeeEntity employee);


    public EmployeeEntity updateEmployee(EmployeeEntity toUpdateEmployee) ;


    public void deleteById(Long id) ;
}
