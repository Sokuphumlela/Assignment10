package payroll.repository.address;

import payroll.domain.Address;
import payroll.repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public interface AddressRepository extends IRepository<Address, String>{
    Set<Address> getAll();
}
