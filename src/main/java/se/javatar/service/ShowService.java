package se.javatar.service;

import se.javatar.entities.ShowEntity;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface ShowService {

    List<ShowEntity> getAllShows();

    ShowEntity getShowById(Long id);

    void addShow(ShowEntity showEntity);

    void updateShow(ShowEntity showEntity);


}
