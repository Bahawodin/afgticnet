package se.javatar.domain.objects;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public class Venue {

    private Long id;
    private String name;
    private String description;
    private MediaItem mediaItem;
    private Address address;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MediaItem getMediaItem() {
        return mediaItem;
    }

    public Address getAddress() {
        return address;
    }

    private Venue(VenueBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.mediaItem = builder.mediaItem;
        this.address = builder.address;
    }

    public static class VenueBuilder {
        private Long id;
        private String name;
        private String description;
        private MediaItem mediaItem;
        private Address address;

        public VenueBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public VenueBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public VenueBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public VenueBuilder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public VenueBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Venue build(){
            return new Venue(this);
        }
    }
}
