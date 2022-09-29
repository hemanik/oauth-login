package com.security.oauthlogin.auth;

import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.security.oauth2.client.http.OAuth2ErrorResponseErrorHandler;

@Slf4j
public class CustomOAuth2ErrorResponseErrorHandler extends OAuth2ErrorResponseErrorHandler {

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        log.warn("Exception occurred during Google authentication. Request-Id: {}, StatusCode: {}",
                response.getHeaders().getFirst("pragma"), response.getStatusCode());
        super.handleError(response);
    }
}
