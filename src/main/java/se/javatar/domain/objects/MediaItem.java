package se.javatar.domain.objects;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public class MediaItem {

    private Long id;
    private MediaType mediaType;
    private String url;

    private MediaItem(MediaItemBuilder builder){
        this.id = builder.id;
        this.mediaType = builder.mediaType;
        this.url = builder.url;
    }

    public Long getId() {
        return id;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public String getUrl() {
        return url;
    }

    //Builder class
    public static class MediaItemBuilder{
        private Long id;
        private MediaType mediaType;
        private String url;

        public MediaItemBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public MediaItemBuilder setMediaType(MediaType mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public MediaItemBuilder setUrl(String url) {
            this.url = url;
            return this;
        }

        public MediaItem build(){
            return new MediaItem(this);
        }
    }
}
