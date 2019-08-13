package payroll.repository.user;

import payroll.domain.user.Employee;
import payroll.domain.user.EmployeeGender;
import payroll.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}