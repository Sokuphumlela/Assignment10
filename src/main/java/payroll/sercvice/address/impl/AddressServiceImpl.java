package payroll.sercvice.address.impl;

import payroll.domain.Address;
import payroll.repository.address.AddressRepository;
import payroll.repository.address.impl.AddressRepositoryImpl;
import payroll.sercvice.address.AddressService;

import java.util.Set;

public class AddressServiceImpl implements AddressService{

    private static AddressServiceImpl service = null;
    private AddressRepository repository;

    private AddressServiceImpl() {this.repository = AddressRepositoryImpl.getRepository();}

    public static AddressServiceImpl getService(){
        if (service == null) service = new AddressServiceImpl();
        return service;
    }




}
