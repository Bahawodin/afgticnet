package se.javatar.dao;

import org.springframework.data.repository.CrudRepository;
import se.javatar.entities.Show;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface ShowDAO extends CrudRepository<Show, Long> {
}
