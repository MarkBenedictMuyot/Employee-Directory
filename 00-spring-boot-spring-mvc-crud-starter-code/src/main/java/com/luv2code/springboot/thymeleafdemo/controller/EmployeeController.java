package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    //since only one constructor @Autowire is optional since it is autoinjected
    public EmployeeController(EmployeeService theEmployeeService) {

        employeeService = theEmployeeService;
    }
    @GetMapping("/list")
    public String listEmployees(Model theModel) {
    List<Employee> theEmployees =employeeService.findAll();
    theModel.addAttribute("employees", theEmployees);
    return "list-employees";
    }

}
