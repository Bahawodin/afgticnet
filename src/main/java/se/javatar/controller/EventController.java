package se.javatar.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.javatar.entities.EventEntity;
import se.javatar.service.EventService;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    EventService eventService;

    @RequestMapping(value = "/get-all-events")
    public List<EventEntity> getAllEvents() {
        return eventService.getAllEvents();
    }

    @RequestMapping(value = "/add-event", method = RequestMethod.POST)
    public void addShow(@RequestBody JsonNode event) {

        event.forEach(e -> System.out.println(e.toString()));

        //System.out.println(event);

        //eventService.addEvent(event);
    }
}
