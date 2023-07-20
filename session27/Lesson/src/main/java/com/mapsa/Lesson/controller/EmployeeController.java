package com.mapsa.Lesson.controller;

import com.mapsa.Lesson.entity.EmployeeEntity;
import com.mapsa.Lesson.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService ;
    @GetMapping
    public List<EmployeeEntity> getEmployees(){
        return employeeService.getEmployee() ;
    }

   @GetMapping("{id}")
    public EmployeeEntity getEmployeeById(@PathVariable Long id){
      return   employeeService.getById(id) ;
    }

    @PostMapping
    public void createEmployee (@RequestBody EmployeeEntity employeeEntity){
        System.out.println("employeeEntity : " + employeeEntity);
        employeeService.createEmployee(employeeEntity);
    }

}
