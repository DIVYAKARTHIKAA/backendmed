package com.example.backendcode.service;



import java.util.List;

import com.example.backendcode.dto.request.UserRequest;
import com.example.backendcode.dto.response.UserResponse;


public interface UserService {

    List<UserResponse> getAllUsers();

    UserResponse getUser(Long uid);

    UserResponse updateUser(UserRequest request, Long uid);

   
	

}
