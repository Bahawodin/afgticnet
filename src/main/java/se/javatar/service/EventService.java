package se.javatar.service;

import se.javatar.entities.Event;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface EventService {

    List<Event> getAllEvents();

    Event getEventById(Long id);

    void addEvent(Event event);

    void updateEvent(Event event);
}
