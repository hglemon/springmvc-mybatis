package com.rlk.mi.service;

import com.rlk.mi.entity.UserInfo;
import junit.framework.TestCase;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by lifei.ding on 15-6-25.
 */
public class UserInfoServiceImplTest extends TestCase {
    @Resource(name = "userInfoServiceImpl")
    private UserInfoService userInfoService;
    @Test
    public void saveTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setType(1);
        userInfo.setUid(11111);
        userInfoService.create(userInfo);
    }
}