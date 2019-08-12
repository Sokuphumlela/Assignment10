package payroll.sercvice.user;

import payroll.domain.user.Employee;
import payroll.sercvice.IServices;

import java.util.Set;

public interface EmployeeService extends IServices<Employee, String> {
    Set<Employee> getAll();
}
