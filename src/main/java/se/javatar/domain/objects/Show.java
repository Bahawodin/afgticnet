package se.javatar.domain.objects;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public class Show {

    private Long id;
    private Event event;
    private Venue venue;
    private MediaItem mediaItem;
    private LocalDate date;
    private Set<TicketPrice> ticketPrice = new HashSet<>();

    public Long getId() {
        return id;
    }

    public Event getEvent() {
        return event;
    }

    public Venue getVenue() {
        return venue;
    }

    public MediaItem getMediaItem() {
        return mediaItem;
    }

    public LocalDate getDate() {
        return date;
    }

    public Set<TicketPrice> getTicketPrice() {
        return ticketPrice;
    }

    private Show(ShowBuilder builder) {
        this.id = builder.id;
        this.event = builder.event;
        this.venue = builder.venue;
        this.mediaItem = builder.mediaItem;
        this.date = builder.date;
        this.ticketPrice = builder.ticketPrice;
    }

    //Builder class
    public static class ShowBuilder {
        private Long id;
        private Event event;
        private Venue venue;
        private MediaItem mediaItem;
        private LocalDate date;
        private Set<TicketPrice> ticketPrice = new HashSet<>();

        public ShowBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public ShowBuilder setEvent(Event event) {
            this.event = event;
            return this;
        }

        public ShowBuilder setVenue(Venue venue) {
            this.venue = venue;
            return this;
        }

        public ShowBuilder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public ShowBuilder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public ShowBuilder setTicketPrice(Set<TicketPrice> ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }

        public Show build(){
            return new Show(this);
        }
    }
}
