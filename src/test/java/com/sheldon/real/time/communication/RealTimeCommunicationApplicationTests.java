package com.sheldon.real.time.communication;


import com.sheldon.real.time.communication.entity.User;
import com.sheldon.real.time.communication.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RealTimeCommunicationApplication.class)
public class RealTimeCommunicationApplicationTests {


    @Autowired
    private UserMapper userMapper;


    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectAll();
        for (User user:users) {
            System.out.println(user.getUsername());
        }
    }

}

