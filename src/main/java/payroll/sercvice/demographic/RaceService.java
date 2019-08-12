package payroll.sercvice.demographic;

import payroll.domain.demographic.Race;
import payroll.sercvice.IServices;

import java.util.Set;

public interface RaceService extends IServices<Race, String> {
    Set<Race> getAll();
}