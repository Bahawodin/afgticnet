package se.javatar.dao;

import org.springframework.data.repository.CrudRepository;
import se.javatar.entities.Show;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface ShowDAO extends CrudRepository<Show, Long> {

    List<Show> findByEventId(Long id);
}
