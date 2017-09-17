package se.javatar.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@Entity
public class VenueEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    private MediaItemEntity mediaItemEntity;

    private AddressEntity addressEntity;

    public VenueEntity() {
    }

    public VenueEntity(String name, String description, AddressEntity addressEntity) {
        this.name = name;
        this.description = description;
        this.addressEntity = addressEntity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    @Override
    public String toString() {
        return "VenueEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", addressEntity=" + addressEntity +
                '}';
    }
}
