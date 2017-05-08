package se.javatar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@RestController
public class StartPageController {

    @RequestMapping("/start")
    public String response() {
        return "This is a response";
    }


}
