package se.javatar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.javatar.entities.Event;
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
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @RequestMapping(value = "/add-event", method = RequestMethod.POST)
    public void addShow(@RequestBody Event event) {

        System.out.println(event);

        eventService.addEvent(event);
    }
}
