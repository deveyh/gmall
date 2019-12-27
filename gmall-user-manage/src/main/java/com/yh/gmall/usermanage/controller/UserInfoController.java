package com.yh.gmall.usermanage.controller;

import com.yh.gmall.UserInfo;
import com.yh.gmall.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created on 2019-12-26-22:23
 *
 * @author yh
 */
@Controller
public class UserInfoController {
    @Resource
    private UserInfoService userInfoServiceImpl;
    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        List<UserInfo> userInfoList = userInfoServiceImpl.getUserInfoList();
        return userInfoList;
    }
    @RequestMapping("add")
    @ResponseBody
    public void add(){
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail("test@qq.com");
        userInfo.setLoginName("test");
        userInfo.setName("testQQ");
        userInfo.setPasswd("test");
        userInfoServiceImpl.addUser(userInfo);
    }

    @RequestMapping("upd")
    @ResponseBody
    public void upd(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("4");
        userInfo.setNickName("testAdmin-test");
        userInfoServiceImpl.updateUser(userInfo);
    }

    @RequestMapping("upd1")
    @ResponseBody
    public void upd1(String name){
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName("testAdmin-test");
        userInfoServiceImpl.updateUserByName(name,userInfo);
    }

    @RequestMapping("del")
    @ResponseBody
    public void del(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("4");
        userInfoServiceImpl.delUser(userInfo);
    }

}
