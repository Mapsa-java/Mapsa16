package com.mapsa.Lesson.service;

import com.mapsa.Lesson.entity.EmployeeEntity;
import com.mapsa.Lesson.reposirtory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplV2 implements  EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository ;
    @Override
    public List<EmployeeEntity> getEmployee() {
       return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity getById(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
      return   employeeRepository.save(employee) ;
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity toUpdateEmployee) {
         return    employeeRepository.save(toUpdateEmployee) ;
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
