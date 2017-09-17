package se.javatar.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.javatar.dao.EventDAO;
import se.javatar.entities.EventEntity;
import se.javatar.service.EventService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@Service
public class EventServiceImpl implements EventService{

    @Autowired
    EventDAO eventDAO;

    @Override
    public List<EventEntity> getAllEvents() {
        List<EventEntity> eventEntities = new ArrayList<>();
        eventDAO.findAll()
                .forEach(eventEntities::add);
        return eventEntities;
    }

    @Override
    public EventEntity getEventById(Long id) {
        return eventDAO.findOne(id);
    }

    @Override
    public void addEvent(EventEntity eventEntity) {
        eventDAO.save(eventEntity);
    }

    @Override
    public void updateEvent(EventEntity eventEntity) {
        eventDAO.save(eventEntity);
    }
}
