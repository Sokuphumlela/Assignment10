package payroll.sercvice.user;


import payroll.domain.user.EmployeeGender;
import payroll.sercvice.IServices;

import java.util.Set;

public interface EmployeeGenderService extends IServices<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}