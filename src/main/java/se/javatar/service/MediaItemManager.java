package se.javatar.service;

import se.javatar.entities.MediaItemEntity;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface MediaItemManager {

    List<MediaItemEntity> getAllMediaItems();

    MediaItemEntity getMediaItemById(Long id);

    void addMediaItem(MediaItemEntity mediaItemEntity);

    void updateMediaItem(MediaItemEntity mediaItemEntity);

}
