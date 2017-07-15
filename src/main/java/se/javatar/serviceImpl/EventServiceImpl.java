package se.javatar.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.javatar.dao.EventDao;
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
    EventDao eventDao;

    @Override
    public List<EventEntity> getAllEvents() {
        List<EventEntity> eventEntities = new ArrayList<>();
        eventDao.findAll()
                .forEach(eventEntities::add);
        return eventEntities;
    }

    @Override
    public EventEntity getEventById(Long id) {
        return eventDao.findOne(id);
    }

    @Override
    public void addEvent(EventEntity eventEntity) {
        eventDao.save(eventEntity);
    }

    @Override
    public void updateEvent(EventEntity eventEntity) {
        eventDao.save(eventEntity);
    }
}
