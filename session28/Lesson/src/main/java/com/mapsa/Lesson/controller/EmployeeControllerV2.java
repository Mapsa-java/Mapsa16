package com.mapsa.Lesson.controller;

import com.mapsa.Lesson.entity.EmployeeEntity;
import com.mapsa.Lesson.service.EmployeeService;
import com.mapsa.exception.ErrorMessage;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees/v2")

public class EmployeeControllerV2 {

    @Autowired
    @Qualifier("employeeServiceImplV2")
    EmployeeService employeeService;

    @GetMapping
    public List<EmployeeEntity> getEmployees() {
        return employeeService.getEmployee();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable Long id) {
        return employeeService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        employeeService.deleteById(id);
    }

    @PostMapping
    public EmployeeEntity createEmployee(@Valid @RequestBody EmployeeEntity employeeEntity) {
        System.out.println("employeeEntity : " + employeeEntity);
        return employeeService.createEmployee(employeeEntity);
    }


    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
        System.out.println("employeeEntity in put mapping: " + employeeEntity);
        return employeeService.updateEmployee(employeeEntity);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ErrorMessage methodArgExceptionHandler(MethodArgumentNotValidException error) {
        return new ErrorMessage(406, error.getAllErrors().get(0).getDefaultMessage());

    }

}
