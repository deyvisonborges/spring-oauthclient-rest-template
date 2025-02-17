//package com.oauth.auth_client;
//
//import org.springframework.security.oauth2.client.AuthorizedClientServiceOAuth2AuthorizedClientManager;
//import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Collections;
//import java.util.Objects;
//
//public class CustomRestTemplate extends RestTemplate {
//    public static final String AUTHORIZATION = "Authorization";
//    public static final String BEARER = "Bearer ";
//
//    public CustomRestTemplate(final AuthorizedClientServiceOAuth2AuthorizedClientManager authorizedClientServiceAndManager) {
//        try {
////            this.getInterceptors().add((request, body, execution) -> {
////                OAuth2AuthorizeRequest authorizeRequest = OAuth2AuthorizeRequest.withClientRegistrationId("client-id")
////                    .principal("client-id")
////                    .build();
////                OAuth2AuthorizedClient authorizedClient = authorizedClientServiceAndManager.authorize(authorizeRequest);
////                if (authorizedClient != null) {
////                    final var token = authorizedClient.getAccessToken().getTokenValue();
////                    request.getHeaders().set(AUTHORIZATION, BEARER.concat(token));
////                }
////                return execution.execute(request, body);
////            });
//
//            this.getInterceptors().add((request, body, execution) -> {
//                OAuth2AuthorizeRequest authorizeRequest = OAuth2AuthorizeRequest.withClientRegistrationId("client-id")
//                        .principal("client-id RestTemplate Oauth2")
//                        .build();
//                OAuth2AuthorizedClient authorizedClient = authorizedClientServiceAndManager.authorize(authorizeRequest);
//                final var token = Objects.requireNonNull(authorizedClient).getAccessToken().getTokenValue();
//                System.out.println(token);
//                request.getHeaders().put(AUTHORIZATION, Collections.singletonList(BEARER.concat(token)));
//                return execution.execute(request, body);
//            });
//        } catch (Exception e) {
//            throw new RuntimeException(e.getCause());
//        }
//    }
//}
