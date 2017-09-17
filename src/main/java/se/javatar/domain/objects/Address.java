package se.javatar.domain.objects;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public class Address {

    private String street;
    private String city;
    private String country;

    private Address(AddressBuilder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.country = builder.country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    //Builder class
    public static class AddressBuilder{
        private String street;
        private String city;
        private String country;

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
