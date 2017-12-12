package se.javatar.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.javatar.dao.MediaItemDAO;
import se.javatar.entities.MediaItemEntity;
import se.javatar.service.MediaItemManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@Service
public class MediaItemManagerImpl implements MediaItemManager {

    @Autowired
    MediaItemDAO mediaItemDAO;

    @Override
    public List<MediaItemEntity> getAllMediaItems() {
        List<MediaItemEntity> mediaItemEntities = new ArrayList<>();
        mediaItemDAO.findAll()
                .forEach(mediaItemEntities::add);
        return mediaItemEntities;
    }

    @Override
    public MediaItemEntity getMediaItemById(Long id) {
        return null;
    }

    @Override
    public void addMediaItem(MediaItemEntity mediaItemEntity) {
        mediaItemDAO.save(mediaItemEntity);
    }

    @Override
    public void updateMediaItem(MediaItemEntity mediaItemEntity) {

    }
}
