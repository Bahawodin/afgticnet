package se.javatar.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@Embeddable
public class AddressEntity implements Serializable {

    private String street;
    private String city;
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        AddressEntity addressEntity = (AddressEntity) o;

        if (city != null ? !city.equals(addressEntity.city) : addressEntity.city != null)
            return false;
        if (country != null ? !country.equals(addressEntity.country) : addressEntity.country != null)
            return false;
        if (street != null ? !street.equals(addressEntity.street) : addressEntity.street != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + country;
    }
}