package com.gjw.service.impl;

import com.gjw.bean.AdminInfo;
import com.gjw.mapper.AdminMapper;
import com.gjw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminInfo adminLogin(AdminInfo adminInfo) {
        AdminInfo info = adminMapper.adminLogin(adminInfo);
        return info;
    }
}
