package se.javatar.dao;

import org.springframework.data.repository.CrudRepository;
import se.javatar.entities.MediaItemEntity;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface MediaItemDAO extends CrudRepository<MediaItemEntity, Long> {
}
