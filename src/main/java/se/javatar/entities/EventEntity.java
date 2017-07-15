package se.javatar.entities;

import se.javatar.domain.objects.EventCategory;
import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@SuppressWarnings("serial")
@Entity
public class EventEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    private MediaItemEntity mediaItemEntity;

    @Enumerated(EnumType.STRING)
    private EventCategory eventCategory;




    /**
     * Default empty constructor
     */
    public EventEntity() {
    }

    /**
     * Constructor for creating the object with params
     * @param name of the event
     * @param description of the event
     */
    public EventEntity(String name, String description) {
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

    public MediaItemEntity getMediaItemEntity() {
        return mediaItemEntity;
    }

    public void setMediaItemEntity(MediaItemEntity mediaItemEntity) {
        this.mediaItemEntity = mediaItemEntity;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return "EventEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", eventCategory=" + eventCategory +
                '}';
    }
}
