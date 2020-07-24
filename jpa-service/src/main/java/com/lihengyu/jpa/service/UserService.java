package com.lihengyu.jpa.service;

import com.lihengyu.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    MyPageImpl list(UserVo userVo);//列表


    boolean del(int id);//删除

    boolean add(User user);//添加

    // 获取部门的列表
    List<Depart> listDeparts();

    List<Favourite> listFavourites();
}
