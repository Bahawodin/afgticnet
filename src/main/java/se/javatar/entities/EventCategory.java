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
public class EventCategory implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    /**
     * Default constructor
     */
    public EventCategory() {
    }

    /**
     * Constructor with params
     * @param description of the event
     */
    public EventCategory(String description) {
        this.description = description;
    }

    /**
     * Get the event category ID
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Get the description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description for event category
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventCategory that = (EventCategory) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "EventCategory{" +
                "description='" + description + '\'' +
                '}';
    }
}
