package com.yh.gmall.service;

import com.yh.gmall.UserInfo;

import java.util.List;

/**
 * Created on 2019-12-26-22:18
 *
 * @author yh
 */
public interface UserInfoService {
    List<UserInfo> getUserInfoList();
    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);
}
