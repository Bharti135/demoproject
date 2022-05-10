package com.springBootProject.demoproject.controller;

import com.springBootProject.demoproject.model.Employee;
import com.springBootProject.demoproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("ListEmployees",employeeService.getAllEmployees());
        return "index";
    }
    @GetMapping("/showNewEmployeeForm")
     public String showNewEmployeeForm( Model model){
        //create model attribute to bind form data
         Employee employee= new Employee();
         model.addAttribute("employee", employee);
          return "new_employee";
     }
     @PostMapping("/saveEmployee")
     public String saveEmployee(@ModelAttribute("employee") Employee employee){
        //save employee to database
        employeeService.saveEmployee(employee);
        return"redirect:/";
     }
     @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate (@PathVariable(value="id") long id, Model model){
        //get employee from the service
        Employee employee = employeeService.getEmployeeById(id);
        //set employee as a model attribute to pre_ populate the form
        model.addAttribute("employee", employee);
        return "update_employee";
    }



}
