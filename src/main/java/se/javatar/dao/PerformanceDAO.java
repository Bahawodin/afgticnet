package se.javatar.dao;

import org.springframework.data.repository.CrudRepository;
import se.javatar.entities.Performance;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface PerformanceDAO extends CrudRepository<Performance, Long> {

   //  List<Performance> findByName(String name);

   //  List<Performance> findByShowId(Long id);
}
