package se.javatar.domain.objects;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public enum MediaType {

    IMAGE("Image", true),
    VIDEO("Video", false),
    AUDIO("Audio", false);

    /**
     * A human readable description of the media type.
     */
    private final String description;

    /**
     * A boolean flag indicating whether the media type can be cached.
     */
    private final boolean cacheable;

    private MediaType(String description, boolean cacheable) {
        this.description = description;
        this.cacheable = cacheable;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCacheable() {
        return cacheable;
    }
}
