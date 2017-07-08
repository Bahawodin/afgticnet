package se.javatar.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.javatar.dao.ShowDAO;
import se.javatar.entities.Event;
import se.javatar.entities.Show;
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
    public List<Show> getAllShows() {
        List<Show> shows = new ArrayList<>();
        showDAO.findAll()
                .forEach(shows::add);
        return shows;
    }

    @Override
    public Show getShowById(Long id) {
        return showDAO.findOne(id);
    }

    @Override
    public void addShow(Show show) {
        showDAO.save(show);
    }

    @Override
    public void updateShow(Show show) {
        showDAO.save(show);
    }
}
