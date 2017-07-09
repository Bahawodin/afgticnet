package se.javatar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@SuppressWarnings("serial")
@Entity
public class Event implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private EventCategory eventCategory;

    /**
     * Default empty constructor
     */
    public Event() {
    }

    /**
     * Constructor for creating the object with params
     * @param name of the event
     * @param description of the event
     */
    public Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //The following is the boilerplate getters and setter

    /**
     * Getter for ID
     * @return returns event id
     */
    public Long getId() {
        return id;
    }

    /**
     * Getter for event name
     * @return event name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name of the event
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for description
     * @return event description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for description
     * @param description of the event
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the event category
     * @return
     */
    public EventCategory getEventCategory() {
        return eventCategory;
    }

    /**
     * Set the event category
     * @param eventCategory
     */
    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", eventCategory=" + eventCategory +
                '}';
    }
}
