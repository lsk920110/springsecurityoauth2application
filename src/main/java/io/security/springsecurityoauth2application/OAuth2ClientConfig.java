package io.security.springsecurityoauth2application;


import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.ClientRegistrations;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class OAuth2ClientConfig implements ClientRegistrationRepository{

    public ClientRegistration findByRegistrationId(String registrationId) {

        //        return new InMemoryClientRegistrationRepository(build);
        return ClientRegistrations.fromIssuerLocation("http://localhost:8080/realms/oauth2")
                .registrationId("keycloak")
                .clientId("oauth2-client-app")
                .clientSecret("XFqpYz4h9n8NabUhl21jaQa8APi2ROri")
                .redirectUri("http://localhost:8081/login/oauth2/code/keycloak")
                .build();
    }




//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository() {
//        return new InMemoryClientRegistrationRepository(this.keyclockClientRegistration());
//    }
//
//    private ClientRegistration keyclockClientRegistration() {
//
//        return ClientRegistrations
//                .fromIssuerLocation("http://localhost:8080/realms/oauth2")
//                .registrationId("keycloak")
//                .clientId("oauth2-client-app")
//                .clientSecret("XFqpYz4h9n8NabUhl21jaQa8APi2ROri")
//                .redirectUri("http://localhost:8081/login/oauth2/code/keycloak")
////                .issuerUri("http://localhost:8080/realms/oauth2")
//                .build();
//
//    }


}
