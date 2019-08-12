package payroll.factories.user;

import payroll.domain.user.Employee;
import payroll.util.Misc;

public class EmployeeFactory {
    public static Employee createEmployee(String f, String l){
        return new Employee.Builder()
                .employeeID(Misc.generateId())
                .fName(f)
                .lName(l)
                .build();
    }
}