package com.security.oauthlogin.auth;

import java.io.IOException;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.security.oauth2.client.http.OAuth2ErrorResponseErrorHandler;

public class CustomOAuth2ErrorResponseErrorHandler extends OAuth2ErrorResponseErrorHandler {
    public void handleError(ClientHttpResponse response) throws IOException {
        System.out.printf("Exception occurred during Google authentication. Request-Id: %s, StatusCode: %s",
                response.getHeaders().getFirst("pragma"), response.getStatusCode());
        super.handleError(response);
    }
}
