package com.Employe.EmployeAddress.services;

import com.Employe.EmployeAddress.models.EmployeAddress;
import com.Employe.EmployeAddress.repositories.Irepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmplyeAddressService {
  @Autowired
  private Irepository repo;
    public String addData(EmployeAddress employee) {
        repo.save(employee);
        return "Successfully Updataed";
    }

    public List<EmployeAddress> getAllData() {
      return repo.findAll();
    }


    public Optional<EmployeAddress> getById(Long id) {
       if(repo.findById(id).isPresent()){
         return repo.findById(id);
       }
       return null;
    }


   public String putData(Long id, EmployeAddress data) {
      if(repo.findById(id).isPresent()){
        repo.save(data);
        return "Successfully Update Informationn....!!!";
      }
      return "Id Not Found....!!! please Enter a Valid Id...!!!";
   }

    public String deleteById(Long id) {
      if(repo.findById(id).isPresent()) {
        repo.deleteById(id);
        return "Successfully Deleted By Id";
      }
      return "Id Not Found....!! Please Enter a Valid Id";
    }
}
