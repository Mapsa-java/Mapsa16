package com.mapsa.Lesson.reposirtory;

import com.mapsa.Lesson.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity , Long> {

   List<EmployeeEntity> findByName(String name) ;
   List<EmployeeEntity> findByNameAndLastName(String name , String lastName) ;
   List<EmployeeEntity> findByAgeGreaterThan(Integer age) ;
   List<EmployeeEntity> findByNameAndAgeGreaterThan(String name ,Integer age) ;
   List<EmployeeEntity> findByAgeGreaterThanOrderByAgeAsc(Integer age) ;


}
