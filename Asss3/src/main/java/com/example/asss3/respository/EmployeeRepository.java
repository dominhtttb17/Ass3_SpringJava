package com.example.asss3.respository;
import com.example.asss3.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
