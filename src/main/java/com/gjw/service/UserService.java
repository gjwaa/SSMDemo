package com.gjw.service;

import com.gjw.bean.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserService {
    UserInfo checkRegis(String acc);

    int regis(UserInfo userInfo);

    UserInfo isLogin(UserInfo userInfo);


    List<UserInfo> selectUserInfo();


    List<UserInfo> getUserByLimit(Map<String,Integer> map);
}
