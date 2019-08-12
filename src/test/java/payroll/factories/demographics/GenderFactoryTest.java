package payroll.factories.demographics;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void createGender() {
        Gender g = GenderFactory.createGender("Male");
        assertNotNull(g);
    }

    @Test
    public void createGender1() {
        Race r = RaceFactory.createRace("Hispanic");
        assertNotNull(r);
    }
}