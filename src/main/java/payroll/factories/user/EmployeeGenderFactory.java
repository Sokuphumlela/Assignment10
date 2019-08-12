package payroll.factories.user;

import payroll.domain.user.EmployeeGender;
import payroll.util.Misc;

public class EmployeeGenderFactory {
    public static EmployeeGender createEmployeeGender(){
        return new EmployeeGender.Builder()
                .empNum(Misc.generateId())
                .genderID(Misc.generateId())
                .build();
    }
}