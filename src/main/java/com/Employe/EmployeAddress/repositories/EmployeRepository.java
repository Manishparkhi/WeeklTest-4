package com.Employe.EmployeAddress.repositories;

import com.Employe.EmployeAddress.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employee,Long> {
}
