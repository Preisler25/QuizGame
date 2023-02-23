package PetrikDevOps.Quiz.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HttpController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String HelloUser() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String getLogin(@RequestBody String temp, HttpServletResponse response, HttpServletRequest request) {

        //temp is the login object from the client
        System.out.println(temp);

        //TODO: Check if the user is in the database
        //TODO: If the user is in the database, redirect to the /lobby page
        //TODO: gen JWT token for user and sand it back to the client

        //Setting the token in to the cookie session
        HttpSession session = request.getSession();
        session.setAttribute("Token", "token");

        //Redirecting the user to the /lobby page
        response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
        response.setHeader("Location", "/lobby");

        return "redirect:/lobby";
        //TODO: If the user is not in the database, redirect to the /index page
    }

    @RequestMapping(value = "/lobby", method = RequestMethod.GET)
    public String getLobby(HttpServletRequest request) {

        //From cookie get token
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        String value = (String) session.getAttribute("Token");
        System.out.println(value);


        //TODO: Check if token valid
        //TODO: If token is valid,gen new token and render lobby page
        //TODO: If token is not valid, redirect to /index page
        return "lobby";
    }
}
