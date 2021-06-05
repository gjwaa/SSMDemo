package com.gjw.mapper;

import com.gjw.bean.UserInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/2 14:58
 * @desc:
 */
@Repository
public interface UserMapper {
    UserInfo checkRegis(String acc);

    int regis(UserInfo userInfo);

    UserInfo isLogin(UserInfo userInfo);


    List<UserInfo> selectUserInfo();


    List<UserInfo> getUserByLimit(Map<String,Integer> map);
}
