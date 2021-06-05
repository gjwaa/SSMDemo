package com.gjw.service.impl;

import com.gjw.bean.UserInfo;
import com.gjw.mapper.UserMapper;
import com.gjw.service.RegisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/2 15:00
 * @desc:
 */
@Service
public class RegisServiceImpl implements RegisService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> getUser() {
//        List<UserInfo> user = userMapper.getUser();
        return null;
    }
}
