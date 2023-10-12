package com.example.backendcode.service;

import com.example.backendcode.dto.request.AuthenticationRequest;
import com.example.backendcode.dto.request.RegisterRequest;
import com.example.backendcode.dto.response.AuthenticationResponse;

public interface AuthService {
    boolean userRegistration(RegisterRequest request);

    AuthenticationResponse userAuthentication(AuthenticationRequest request);
}
