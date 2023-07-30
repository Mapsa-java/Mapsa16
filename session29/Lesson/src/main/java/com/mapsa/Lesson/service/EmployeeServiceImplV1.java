package com.mapsa.Lesson.service;

import com.mapsa.Lesson.entity.EmployeeEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplV1 implements  EmployeeService{

    List<EmployeeEntity> employeeEntities ;
    @PostConstruct
    public void initialEmployeeList(){
        System.out.println("In Post Construct");

        employeeEntities = new ArrayList<>() ;
        employeeEntities.add(new EmployeeEntity(1l, "ali"   , "110"));
        employeeEntities.add(new EmployeeEntity(2l,"hasan"  , "220"));
        employeeEntities.add(new EmployeeEntity(3l,"mohamad", "330"));
        employeeEntities.add(new EmployeeEntity(4l,"arian"  , "440"));
        employeeEntities.add(new EmployeeEntity(5l,"huria"  , "550"));
    }

    public List<EmployeeEntity> getEmployee(){
        return employeeEntities ;
    }

    public EmployeeEntity getById(Long id) {
      return   employeeEntities.stream()
              .filter(item->item.getId().equals(id)).findFirst().orElseGet(()->null);
    }

    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        employee.setId(Long.valueOf(employeeEntities.size() + 1));
        employeeEntities.add(employee) ;
        return employee ;
    }


    public  EmployeeEntity updateEmployee(EmployeeEntity toUpdateEmployee) {
        employeeEntities.stream().forEach(item->{
           if ( item.getId() == toUpdateEmployee.getId()){
               item.setName(toUpdateEmployee.getName());
               item.setCode(toUpdateEmployee.getCode());

           }
        });
        return toUpdateEmployee;

    }


    public void deleteById(Long id) {
        employeeEntities =  employeeEntities
                .stream()
                .filter(item -> item.getId() != id)
                .collect(Collectors.toList());

    }
}
