package com.rays.serviceImp;

import com.rays.bean.UserBean;
import com.rays.mapper.UserMapper;
import com.rays.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean getUser(int userId) {
        return userMapper.getUser(userId);
    }
}
