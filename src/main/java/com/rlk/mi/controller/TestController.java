package com.rlk.mi.controller;

import com.rlk.mi.entity.UserInfo;
import com.rlk.mi.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Locale;

/**
 * Created by lifei.ding on 15-6-25.
 */
@Controller
public class TestController {
    @Autowired
    private UserInfoService userInfoService1;
    @RequestMapping(value = "/registered", method = RequestMethod.GET)
    public String test2(Locale locale, Model model) {
        List<UserInfo> userInfo = userInfoService1.getAllList();
        for(UserInfo userInfos : userInfo) {
            System.out.println(userInfos.getUid()+", "+userInfos.getType());
        }
        model.addAttribute("userInfo", userInfo);
        System.out.println("----------insert before-------");
//        UserInfo userInfo = new UserInfo();
//        userInfo.setType(1);
//        userInfo.setUid(11111);
//        userInfoService.create(userInfo);
        System.out.println("----------insert end-------");
        return "account/register";
    }
}
