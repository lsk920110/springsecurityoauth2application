package io.security.springsecurityoauth2application;

import com.nimbusds.oauth2.sdk.client.ClientRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.ClientRegistrations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class IndexController {

    @Autowired
    private
    ClientRegistrationRepository clientRegistrationRepository;


    @GetMapping("/")
    public String index() {

        ClientRegistration clientRegistration = this.clientRegistrationRepository.findByRegistrationId("keyclock");

        String clientId = clientRegistration.getClientId();
        System.out.println("clientId = " + clientId);
//
        String redirectUri = clientRegistration.getRedirectUri();
        System.out.println("redirectUri = " + redirectUri);


        return "index";
    }


}

