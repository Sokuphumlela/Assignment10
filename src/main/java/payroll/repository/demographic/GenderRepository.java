package payroll.repository.demographic;

import payroll.domain.demographic.Gender;
import payroll.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}