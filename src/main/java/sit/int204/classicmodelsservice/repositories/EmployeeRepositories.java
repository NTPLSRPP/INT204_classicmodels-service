package sit.int204.classicmodelsservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelsservice.entities.Employee;

public interface EmployeeRepositories extends JpaRepository<Employee, Integer> {

}
