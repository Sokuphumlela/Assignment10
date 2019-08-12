package payroll.repository.user;

import payroll.domain.user.Employee;
import payroll.domain.user.EmployeeGender;
import payroll.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}