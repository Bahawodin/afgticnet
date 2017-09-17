package se.javatar.domain.objects;

import se.javatar.entities.MediaItemEntity;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public class Event {

    private Long id;
    private String name;
    private String description;
    private MediaItemEntity mediaItem;
    private EventCategory eventCategory;

    private Event(EventBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.mediaItem = builder.mediaItem;
        this.eventCategory = builder.eventCategory;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MediaItemEntity getMediaItem() {
        return mediaItem;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    //Builder class
    public static class EventBuilder {
        private Long id;
        private String name;
        private String description;
        private MediaItemEntity mediaItem;
        private EventCategory eventCategory;

        public EventBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public EventBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EventBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public EventBuilder setMediaItem(MediaItemEntity mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public EventBuilder setEventCategory(EventCategory eventCategory) {
            this.eventCategory = eventCategory;
            return this;
        }

        public Event build(){
            return new Event(this);
        }
    }

}
