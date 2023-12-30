package com.springapi.apidemo.Repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springapi.apidemo.HomeEntity.Employee;

@Repository
public class EmployeeRepository {
public static HashMap<Integer,Employee> empRepo=new HashMap<Integer,Employee>();
static{
    empRepo.put(1,new Employee(1,"Raj","Mumbai",10000));
    empRepo.put(2,new Employee(2,"Rahul","Pune",20000));
    empRepo.put(3,new Employee(3,"Ramesh","Delhi",30000));
    empRepo.put(4,new Employee(4,"Rajesh","Banglore",40000));
}
public Map<Integer,Employee> getAllEmployee(int id){
    return empRepo;
}



}
