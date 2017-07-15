package se.javatar.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.javatar.dao.ShowDAO;
import se.javatar.entities.ShowEntity;
import se.javatar.service.ShowService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    private ShowDAO showDAO;


    @Override
    public List<ShowEntity> getAllShows() {
        List<ShowEntity> showEntities = new ArrayList<>();
        showDAO.findAll()
                .forEach(showEntities::add);
        return showEntities;
    }

    @Override
    public ShowEntity getShowById(Long id) {
        return showDAO.findOne(id);
    }

    @Override
    public void addShow(ShowEntity showEntity) {
        showDAO.save(showEntity);
    }

    @Override
    public void updateShow(ShowEntity showEntity) {
        showDAO.save(showEntity);
    }
}
