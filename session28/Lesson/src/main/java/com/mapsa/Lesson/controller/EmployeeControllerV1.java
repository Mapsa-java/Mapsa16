package com.mapsa.Lesson.controller;

import com.mapsa.Lesson.entity.EmployeeEntity;
import com.mapsa.Lesson.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees/v1")
public class EmployeeControllerV1 {

    @Autowired
    @Qualifier("employeeServiceImplV1")
    EmployeeService employeeService ;
    @GetMapping
    public List<EmployeeEntity> getEmployees(){
        return employeeService.getEmployee() ;
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable Long id){
      return   employeeService.getById(id) ;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
           employeeService.deleteById(id) ;
    }

    @PostMapping
    public void createEmployee (@RequestBody EmployeeEntity employeeEntity){
        System.out.println("employeeEntity : " + employeeEntity);
        employeeService.createEmployee(employeeEntity);
    }


    @PutMapping
    public void updateEmployee (@RequestBody EmployeeEntity employeeEntity){
        System.out.println("employeeEntity in put mapping: " + employeeEntity);
        employeeService.updateEmployee(employeeEntity);
    }

}
