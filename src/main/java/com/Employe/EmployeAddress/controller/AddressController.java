package com.Employe.EmployeAddress.controller;


import com.Employe.EmployeAddress.models.EmployeAddress;
import com.Employe.EmployeAddress.services.EmplyeAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class AddressController {
//    GET /addresses - get all addresses
//    GET /addresses/{id} - get an address by id
//    POST /addresses - create a new address
//    PUT /addresses/{id} - update an address by id
//    DELETE /addresses/{id} - delete an address by id

    @Autowired
    private EmplyeAddressService addreesService;

    @PostMapping(value = "post")
    public String addData(@RequestBody EmployeAddress employee){
       return addreesService.addData(employee);
    }

    @GetMapping("getAllData")
    public List<EmployeAddress> getAllData(){
        return addreesService.getAllData();
    }

    @GetMapping(value = "getById/{id}")
    public Optional<EmployeAddress> getById(@PathVariable Long id){
        return addreesService.getById(id);
    }

    @PutMapping(value = "postData/{id}")
    public String postData(@PathVariable Long id , @RequestBody EmployeAddress data){
        return addreesService.putData(id,data);
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteByyId(@PathVariable Long id){
        return addreesService.deleteById(id);
    }

}
