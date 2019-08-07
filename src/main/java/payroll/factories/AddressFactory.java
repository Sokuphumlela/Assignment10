package payroll.factories;

import payroll.domain.Address;
import payroll.util.Misc;

public class AddressFactory {

    public static Address buildAddress(String addressName) {

        return new Address.Builder().atAddressId(Misc.generateId())
                .atAddressName(addressName)
                .build();
    }
}
