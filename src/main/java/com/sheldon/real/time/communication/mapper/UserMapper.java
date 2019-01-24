package com.sheldon.real.time.communication.mapper;

import com.sheldon.real.time.communication.entity.User;
import com.sheldon.real.time.communication.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;




@Mapper
public interface UserMapper extends MyMapper<User> {
}