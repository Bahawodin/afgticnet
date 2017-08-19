package se.javatar.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.TemporalType.TIMESTAMP;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@SuppressWarnings("serial")
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "event_entity_id", "venue_entity_id" }))
public class ShowEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    //@NotNull
    private EventEntity eventEntity;

    @ManyToOne
    //@NotNull
    private VenueEntity venueEntity;

    @ManyToOne
    private MediaItemEntity mediaItemEntity;

    @Temporal(TIMESTAMP)
    //@NotNull
    private Date date;

    @OneToMany(mappedBy = "showEntity", cascade = CascadeType.ALL, fetch = EAGER)
    private Set<TicketPriceEntity> ticketPriceEntities = new HashSet<TicketPriceEntity>();

    public ShowEntity() {
    }

    public ShowEntity(EventEntity eventEntity, VenueEntity venueEntity) {
        this.eventEntity = eventEntity;
        this.venueEntity = venueEntity;
    }

    public Long getId() {
        return id;
    }

    public EventEntity getEventEntity() {
        return eventEntity;
    }

    public void setEventEntity(EventEntity eventEntity) {
        this.eventEntity = eventEntity;
    }

    public VenueEntity getVenueEntity() {
        return venueEntity;
    }

    public void setVenueEntity(VenueEntity venueEntity) {
        this.venueEntity = venueEntity;
    }

    public MediaItemEntity getMediaItemEntity() {
        return mediaItemEntity;
    }

    public void setMediaItemEntity(MediaItemEntity mediaItemEntity) {
        this.mediaItemEntity = mediaItemEntity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<TicketPriceEntity> getTicketPriceEntities() {
        return ticketPriceEntities;
    }

    public void setTicketPriceEntities(Set<TicketPriceEntity> ticketPriceEntities) {
        this.ticketPriceEntities = ticketPriceEntities;
    }

    @Override
    public String toString() {
        return "ShowEntity{" +
                "id=" + id +
                ", eventEntity=" + eventEntity +
                ", venueEntity=" + venueEntity +
                ", date=" + date +
                '}';
    }
}
