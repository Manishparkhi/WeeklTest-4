package com.Employe.EmployeAddress.repositories;

import com.Employe.EmployeAddress.models.EmployeAddress;
import com.Employe.EmployeAddress.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface Irepository extends JpaRepository<EmployeAddress,Long> {

}
