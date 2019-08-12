package payroll.factories.demographics;

import payroll.domain.demographic.Race;
import payroll.util.Misc;

public class RaceFactory {
    public static Race createRace(String race){
        return new Race.Builder()
                .raceID(Misc.generateId())
                .race(race)
                .build();
    }
}
