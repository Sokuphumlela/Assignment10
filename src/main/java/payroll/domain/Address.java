package payroll.domain;

import java.util.Objects;

public class Address {

    private String addressId, addressName;

    private Address(){}

    private Address(Builder builder){
        this.addressId = builder.addressId;
        this.addressName = builder.addressName;
    }

    public String getAddressId() {return addressId;}

    public String getAddressName() {return addressName;}

    public static class Builder{
        private String addressId;
        private String addressName;

        public Builder atAddressId(String addressId) {

            this.addressId = addressId;
            return this;
        }

        public Builder atAddressName(String addressName){

            this.addressName = addressName;
            return this;
        }

        public Builder copy(Address address){
            this.addressId = addressId;
            this.addressName = addressName;

            return this;
        }

        public Address build() {
            return new Address(this);
        }

    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", addressName='" + addressName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getAddressId(), address.getAddressId()) &&
                Objects.equals(getAddressName(), address.getAddressName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddressId(), getAddressName());
    }
}
