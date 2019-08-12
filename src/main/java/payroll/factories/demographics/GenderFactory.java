package payroll.factories.demographics;

import payroll.domain.demographic.Gender;
import payroll.util.Misc;

public class GenderFactory {
    public static Gender createGender(String gender){
        return new Gender.Builder()
                .genderID(Misc.generateId())
                .genderType(gender)
                .build();
    }
}