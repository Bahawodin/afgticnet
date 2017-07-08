package se.javatar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.javatar.entities.Show;
import se.javatar.service.ShowService;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    ShowService showService;

    @RequestMapping(value = "/get-all-shows")
    public List<Show> getAllShows() {
        return showService.getAllShows();
    }

    @RequestMapping(value = "/add-show", method = RequestMethod.POST)
    public void addShow(@RequestBody Show show) {

        System.out.println(show);

        showService.addShow(show);
    }

}
