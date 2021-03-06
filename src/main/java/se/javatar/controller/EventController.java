package se.javatar.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.javatar.domain.objects.EventCategory;
import se.javatar.domain.objects.MediaType;
import se.javatar.entities.EventEntity;
import se.javatar.entities.MediaItemEntity;
import se.javatar.service.EventService;
import se.javatar.service.MediaItemManager;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    EventService eventService;
    @Autowired
    MediaItemManager mediaItemManager;

    @RequestMapping(value = "/get-all-events")
    public List<EventEntity> getAllEvents() {
        return eventService.getAllEvents();
    }

    @RequestMapping(value = "/add-event", method = RequestMethod.POST)
    public void addEvent(@RequestBody JsonNode event) {

        event.forEach(e -> System.out.println(e.toString()));

        EventEntity entity = new EventEntity();
        entity.setName(event.get("name").toString());
        entity.setDescription(event.get("description").toString());
        //entity.setEventCategory(EventCategory.valueOf(event.get("eventCategory").get("name").toString()));
        entity.setEventCategory(EventCategory.CONSERT);
        MediaItemEntity mediaItemEntity = new MediaItemEntity();
        mediaItemEntity.setUrl(event.get("mediaItemEntity").get("url").toString());
        //mediaItemEntity.setMediaType(MediaType.valueOf(event.get("mediaType").get("url").toString()));
        mediaItemEntity.setMediaType(MediaType.IMAGE);
        mediaItemManager.addMediaItem(mediaItemEntity);
        entity.setMediaItemEntity(mediaItemEntity);


        eventService.addEvent(entity);
    }
}
