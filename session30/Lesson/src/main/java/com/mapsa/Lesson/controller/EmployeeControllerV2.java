package com.mapsa.Lesson.controller;

import com.mapsa.Lesson.entity.EmployeeEntity;
import com.mapsa.Lesson.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/employees")
@Profile("second")
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

    @GetMapping("test/{id}/{name}")
    public ResponseEntity<String> getTest(@PathVariable Long id, @PathVariable("name") String fname) {
        return new ResponseEntity<>(id + "--- " + fname, HttpStatus.OK);
    }

    @GetMapping("testreqparam")
    public ResponseEntity<String> getTestRequestParam(@RequestParam("fname") String firstName,
                                                      @RequestParam("lname") String lastName,
                                                      @RequestParam("email") String email,
                                                      @RequestHeader(name = "user") String requestHeadersUser,
                                                      @RequestHeader HttpHeaders requestHeaders) {
        System.out.println("user header value : " + requestHeadersUser);
        requestHeaders.entrySet().forEach((item) -> {
            System.out.println(item.getKey() + "  : " + item.getValue());
        });

        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("origin", "*");

        return new ResponseEntity<>(firstName + " --- " + lastName + " --- " + email, responseHeader, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        employeeService.deleteById(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EmployeeEntity> createEmployee(@Valid @RequestBody EmployeeEntity employeeEntity) {
        System.out.println("employeeEntity : " + employeeEntity);
        // return employeeService.createEmployee(employeeEntity);
        return new ResponseEntity<>(employeeService.createEmployee(employeeEntity), HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<EmployeeEntity> updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
        System.out.println("employeeEntity in put mapping: " + employeeEntity);
        return new ResponseEntity<>(employeeService.updateEmployee(employeeEntity), HttpStatus.OK);
    }


}
