package se.javatar.dao;

import org.springframework.data.repository.CrudRepository;
import se.javatar.entities.EventEntity;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface EventDAO extends CrudRepository<EventEntity, Long> {
}
