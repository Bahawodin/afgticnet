package se.javatar.service;

import se.javatar.entities.Event;
import se.javatar.entities.Show;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface ShowService {

    List<Show> getAllShows();

    Show getShowById(Long id);

    void addShow(Show show);

    void updateShow(Show show);


}
