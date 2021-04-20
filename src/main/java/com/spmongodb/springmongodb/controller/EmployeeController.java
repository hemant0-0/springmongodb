package com.spmongodb.springmongodb.controller;

import com.spmongodb.springmongodb.model.Employee;
import com.spmongodb.springmongodb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/saveEmp")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Save_Employee";
    }

}
