package se.javatar.dao;

import org.springframework.data.repository.CrudRepository;
import se.javatar.entities.ShowEntity;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface ShowDAO extends CrudRepository<ShowEntity, Long> {

    List<ShowEntity> findByEventId(Long id);
}
