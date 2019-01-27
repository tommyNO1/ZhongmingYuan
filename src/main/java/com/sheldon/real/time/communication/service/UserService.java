package com.sheldon.real.time.communication.service;

import com.sheldon.real.time.communication.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
@Controller

public interface UserService {

    List<User> getAllUser();
}
