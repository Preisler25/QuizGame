package PetrikDevOps.Quiz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HttpController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHello() {
        return "index";
    }
}
