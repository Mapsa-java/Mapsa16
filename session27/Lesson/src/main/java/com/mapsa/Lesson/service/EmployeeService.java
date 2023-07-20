package com.mapsa.Lesson.service;

import com.mapsa.Lesson.entity.EmployeeEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<EmployeeEntity> employeeEntities ;
    @PostConstruct
    public void initialEmployeeList(){
        System.out.println("In Post Construct");

        employeeEntities = new ArrayList<>() ;
        employeeEntities.add(new EmployeeEntity(1l, "ali"   , "110"));
        employeeEntities.add(new EmployeeEntity(2l,"hasan"  , "220"));
        employeeEntities.add(new EmployeeEntity(3l,"mohamad", "330"));
        employeeEntities.add(new EmployeeEntity(4l,"arian"  , "440"));
    }

    public List<EmployeeEntity> getEmployee(){
        return employeeEntities ;
    }

    public EmployeeEntity getById(Long id) {
      return   employeeEntities.stream()
              .filter(item->item.getId().equals(id)).findFirst().orElseGet(()->null);
    }

    public void createEmployee(EmployeeEntity employee) {
        employee.setId(Long.valueOf(employeeEntities.size() + 1));
        employeeEntities.add(employee) ;
    }


}
