package se.javatar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.javatar.entities.Show;
import se.javatar.service.ShowService;

import java.util.List;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    ShowService showService;

    @RequestMapping("/getAllShows")
    public List<Show> getAllShows() {
        return showService.getAllShows();
    }

    @RequestMapping("/addShow")
    public void addShow(Show show) {
        showService.addShow(show);
    }

}
