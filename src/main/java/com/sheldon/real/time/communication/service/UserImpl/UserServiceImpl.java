package com.sheldon.real.time.communication.service.UserImpl;

import com.sheldon.real.time.communication.entity.User;
import com.sheldon.real.time.communication.mapper.UserMapper;
import com.sheldon.real.time.communication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {

        List<User> users = userMapper.selectAll();
        return users;
    }
}
