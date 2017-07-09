package se.javatar.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import se.javatar.dao.EventDao;
import se.javatar.entities.Event;
import se.javatar.service.EventService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public class EventServiceImpl implements EventService{

    @Autowired
    EventDao eventDao;

    @Override
    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        eventDao.findAll()
                .forEach(events::add);
        return events;
    }

    @Override
    public Event getEventById(Long id) {
        return eventDao.findOne(id);
    }

    @Override
    public void addEvent(Event event) {
        eventDao.save(event);
    }

    @Override
    public void updateEvent(Event event) {
        eventDao.save(event);
    }
}
