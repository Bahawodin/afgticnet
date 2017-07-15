package se.javatar.service;

import se.javatar.entities.EventEntity;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public interface EventService {

    List<EventEntity> getAllEvents();

    EventEntity getEventById(Long id);

    void addEvent(EventEntity eventEntity);

    void updateEvent(EventEntity eventEntity);
}
