package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!
    //add custom logic sorting by last name
    public List<Employee> findAllByOrderByLastNameAsc();
    //Spring data JPA will parse the method name looks for a specific format and pattern and creates appropriate query behind the scens
    //ex:findAllBy   OrderByLastNameASC
    //ref:luv2code.com/query-methods
}
