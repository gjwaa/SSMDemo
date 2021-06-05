package com.gjw.service.impl;

import com.gjw.bean.UserInfo;
import com.gjw.mapper.UserMapper;
import com.gjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo checkRegis(String acc) {
        UserInfo userInfo = userMapper.checkRegis(acc);
        return userInfo;
    }

    @Override
    public int regis(UserInfo userInfo) {
        int regis = userMapper.regis(userInfo);
        return regis;
    }

    @Override
    public UserInfo isLogin(UserInfo userInfo) {
        UserInfo login = userMapper.isLogin(userInfo);
        return login;
    }

    @Override
    public List<UserInfo> selectUserInfo() {
        List<UserInfo> userInfos = userMapper.selectUserInfo();
        return userInfos;
    }

    @Override
    public List<UserInfo> getUserByLimit(Map<String, Integer> map) {
        return null;
    }
}
