package PetrikDevOps.Quiz.Controller;

import PetrikDevOps.Quiz.Service.TokenService;
import org.springframework.security.core.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @RequestMapping("/token")
    public String getToken(Authentication authentication) {
        LOG.debug("Generating token for user: {}", authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Generated token: {}", token);
        return token;
    }
}
