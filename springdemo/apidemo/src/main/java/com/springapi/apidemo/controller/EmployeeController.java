package com.springapi.apidemo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.apidemo.HomeEntity.Employee;
import com.springapi.apidemo.Repository.EmployeeRepository;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
   
    //write a get api to call first 3 employees from the employee repository
    @GetMapping("/firstthree")
    public List<Employee> getFirstThreeEmployee(){
        List<Employee> firstThreeEmployee=new ArrayList<Employee>();
        Collection<Employee> allEmployee=employeeRepository.getAllEmployee(0).values();
        int count=0;
        for(Employee emp:allEmployee) {
            if(count<3) {
                firstThreeEmployee.add(emp);
                count++;
            }
        }
         System.out.println(firstThreeEmployee);
        return firstThreeEmployee;
       
    }
}
