package se.javatar.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.javatar.dao.PerformanceDAO;
import se.javatar.entities.Performance;
import se.javatar.service.PerformanceService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@Service
public class PerformanceServiceImpl implements PerformanceService {

    @Autowired
    private PerformanceDAO performanceDAO;

    @Override
    public List<Performance> getAllPerformances() {
        List<Performance> performances = new ArrayList<>();
        performanceDAO.findAll()
                .forEach(performances::add);
        return performances;
    }

    @Override
    public Performance getPerformanceById(Long id) {
        return performanceDAO.findOne(id);
    }

    @Override
    public void addPerformance(Performance performance) {
        performanceDAO.save(performance);
    }

    @Override
    public void updatePerformance(Performance performance) {
        performanceDAO.save(performance);
    }
}
