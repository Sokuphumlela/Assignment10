package payroll.sercvice.demographic.impl;

import payroll.domain.demographic.Gender;
import payroll.repository.demographic.impl.GenderRepositoryImpl;
import payroll.sercvice.demographic.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {
    private static GenderServiceImpl service = null;
    private GenderRepositoryImpl repository;

    public GenderServiceImpl(){
        repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService() {
        if (service == null) {
            return new GenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender read(String string) {
        return repository.read(string);
    }

    @Override
    public Gender update(Gender gender) {
        return repository.update(gender);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }
}
