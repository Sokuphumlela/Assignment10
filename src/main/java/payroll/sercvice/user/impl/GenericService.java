package payroll.sercvice.user.impl;

import payroll.domain.demographic.Gender;
import payroll.domain.user.Employee;
import payroll.domain.user.EmployeeGender;
import payroll.factories.user.EmployeeFactory;
import payroll.factories.user.EmployeeGenderFactory;
import payroll.sercvice.EmployeeService;
import payroll.sercvice.demographic.GenderService;


public class GenericService {

    public Employee createEmployee(String fname, String lname, String gender){
        Employee employee = EmployeeFactory.buildEmployee(fname, lname);
        Gender g = GenderService.getGender(gender);
        EmployeeGender eg = EmployeeGenderFactory.buildEmployeeGender(employee.getEmployeeID(), g.getGenderID());
        EmployeeServiceImpl.getEmployeeService().create(employee);

    }
}
