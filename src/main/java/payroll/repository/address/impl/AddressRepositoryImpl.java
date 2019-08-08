package payroll.repository.address.impl;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import payroll.domain.Address;
import payroll.repository.address.AddressRepository;

import java.util.HashSet;
import java.util.Set;

public class AddressRepositoryImpl implements AddressRepository{

    private static AddressRepositoryImpl repository = null;
    private Set<Address> address;

    private AddressRepositoryImpl() { this.address = new HashSet<>();}

    private Address findAddress(String addressId){
        return this.address.stream()
                .filter(address -> address.getAddressId().trim().equals(addressId))
                .findAny()
                .orElse(null);
    }

    public static AddressRepositoryImpl getRepository(){
        if (repository == null) repository = new AddressRepositoryImpl();
        return repository;
    }

    public Address create(Address address){
        this.address.add(address);
        return address;
    }

    public Address read(final String addressId){
        Address addres = findAddress(addressId);
        return addres;
    }

    public void delete(String addressId){
        Address addres = findAddress(addressId);
        if (addres != null) this.address.remove(addres);
    }

    public Address update(Address address){
        Address toDelete = findAddress(address.getAddressId());
        if(toDelete != null){
            this.address.remove(toDelete);
            return create(address);
        }
        return null;
    }

    public Set<Address> getAll(){return this.address;}
}
