package com.example.sms.service;

import com.example.sms.entity.User;
import com.example.sms.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registrationDto);
}
