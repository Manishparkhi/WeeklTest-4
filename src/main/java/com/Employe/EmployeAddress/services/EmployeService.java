package com.Employe.EmployeAddress.services;

import com.Employe.EmployeAddress.models.Employee;
import com.Employe.EmployeAddress.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {
    @Autowired
    private EmployeRepository repo;
    public List<Employee> getAllData() {
        return repo.findAll();
    }

    public Optional<Employee> findById(Long id) {
        if(repo.findById(id).isPresent()) {
            return repo.findById(id);
        }
        return null;
    }

    public String postData(Employee employee) {
         repo.save(employee);
         return "Post Data Successfully";
    }

    public String deleteById(Long id) {
        if(repo.findById(id).isPresent()) {
            repo.deleteById(id);
            return "Successfully Deleted By Id";
        }
        return "Id Not Found....!! Please Enter a Valid Id";
    }
    public String updateInfo(Long id, Employee employee) {
        if(repo.findById(id).isPresent()){
            repo.save(employee);
            return "Successfully Updation";
        }
        return "Please Enter A Valid Id...!!!";
    }
}
