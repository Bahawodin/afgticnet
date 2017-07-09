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
@Table(name="Appearance", uniqueConstraints = @UniqueConstraint(columnNames = { "event_id", "venue_id" }))
public class Show implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    //@NotNull
    private Event event;

    @ManyToOne
    //@NotNull
    private Venue venue;

    @Temporal(TIMESTAMP)
    //@NotNull
    private Date date;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL, fetch = EAGER)
    private Set<TicketPrice> ticketPrices = new HashSet<TicketPrice>();

    public Show() {
    }

    public Show(Event event, Venue venue) {
        this.event = event;
        this.venue = venue;
    }

    public Long getId() {
        return id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<TicketPrice> getTicketPrices() {
        return ticketPrices;
    }

    public void setTicketPrices(Set<TicketPrice> ticketPrices) {
        this.ticketPrices = ticketPrices;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", event=" + event +
                ", venue=" + venue +
                ", date=" + date +
                '}';
    }
}
