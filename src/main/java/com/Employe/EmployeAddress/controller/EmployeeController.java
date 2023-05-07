package com.Employe.EmployeAddress.controller;

import com.Employe.EmployeAddress.models.Employee;
import com.Employe.EmployeAddress.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v2/")
public class EmployeeController {
    @Autowired
   private EmployeService service;

//    GET /employees - get all employees
//    GET /employees/{id} - get an employee by id
//    POST /employees - create a new employee
//    PUT /employees/{id} - update an employee by id
//    DELETE /employees/{id} - delete an employee by id

    @GetMapping(value = "getAllData")
    public List<Employee> getAllData(){
       return service.getAllData();
    }

    @GetMapping(value = "getById/{id}")
    public Optional<Employee> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping(value = "postData")
    public String postData(@RequestBody Employee employee){
        return service.postData(employee);
    }
    @DeleteMapping(value = "delete/{id}")
    public String deleteById(@PathVariable Long id){
        return service.deleteById(id);
    }
    @PutMapping(value = "updateInfo/{id}")
    public String updateInfo(@PathVariable Long id , @RequestBody Employee employee){
       return service.updateInfo(id,employee);
    }
}
