package se.javatar.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static java.util.logging.Level.ALL;
import static javax.persistence.FetchType.EAGER;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@Entity
@Table(name="Appearance", uniqueConstraints = @UniqueConstraint(columnNames = { "event_id", "venue_id" }))
public class Show implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @NotNull
    private Event event;

    @ManyToOne
    @NotNull
    private Venue venue;

    @OneToMany(fetch = EAGER, mappedBy = "show", cascade = CascadeType.ALL)
    @OrderBy("date")
    private Set<Performance> performances = new HashSet<Performance>();

    public Show() {
    }

    public Show(Event event, Venue venue, Set<Performance> performances) {
        this.event = event;
        this.venue = venue;
        this.performances = performances;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(Set<Performance> performances) {
        this.performances = performances;
    }
}
