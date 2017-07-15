package se.javatar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@SuppressWarnings("serial")
@Entity
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fisrtName;

    private String lastName;

    private AddressEntity addressEntity;

    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity userEntity = (UserEntity) o;
        return Objects.equals(id, userEntity.id) &&
                Objects.equals(fisrtName, userEntity.fisrtName) &&
                Objects.equals(lastName, userEntity.lastName) &&
                Objects.equals(addressEntity, userEntity.addressEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fisrtName, lastName, addressEntity);
    }
}
