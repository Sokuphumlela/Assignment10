package payroll.repository.address.impl;

import payroll.domain.Address;
import payroll.repository.address.AddressRepository;

import java.util.HashSet;
import java.util.Set;

public class AddressRepositoryImpl  implements AddressRepository{

    private static AddressRepositoryImpl repository = null;
    private Set<Address> address;

    private AddressRepositoryImpl() { this.address = new HashSet<>();}

    private Address findAddress(String addressId){
        return this.address.stream()
                .filter(address -> address.getAddressId().trim().equals(addressId))
                .findAny()
                .orElse(null);
    }
}
