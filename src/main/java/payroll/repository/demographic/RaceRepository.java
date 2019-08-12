package payroll.repository.demographic;

import payroll.domain.demographic.Race;
import payroll.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}