package com.gjw.mapper;

import com.gjw.bean.AdminInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    AdminInfo adminLogin(AdminInfo adminInfo);
}
