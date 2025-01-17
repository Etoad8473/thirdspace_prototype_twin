package twin.Event;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventRepository eventRepo;


    //-------------------------GET---------------------------------//
    @GetMapping("/event")
    public List<Event> returnEvents() { return eventRepo.findAll(); }


    //-------------------------POST--------------------------------//
    @PostMapping("/event")
    public Event createEvent(@RequestBody Event event) { return eventRepo.save(event); }


    //-------------------------Delete-------------------------------//
    @DeleteMapping("/event/{id}")
    public @ResponseBody void removeEvent(@PathVariable Long id) { eventRepo.deleteById(id); }
}
