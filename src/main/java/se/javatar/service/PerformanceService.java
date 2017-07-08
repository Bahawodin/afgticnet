package se.javatar.service;

import se.javatar.entities.Performance;
import se.javatar.entities.Show;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface PerformanceService {

    List<Performance> getAllPerformances();

    Performance getPerformanceById(Long id);

    void addPerformance(Performance performance);

    void updatePerformance(Performance performance);
}
