package com.buy.rush.controller;

import com.buy.rush.dao.UserInfoDoMapper;
import com.buy.rush.dataObject.UserInfoDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UserInfoDoMapper userInfoDoMapper;

    @RequestMapping("/test")
    public String test(){
        UserInfoDo userInfoDo = userInfoDoMapper.selectByPrimaryKey(1);
        if(userInfoDo == null){
            return "用户对象不存在";
        } else {
            return userInfoDo.getName();
        }
    }

}
