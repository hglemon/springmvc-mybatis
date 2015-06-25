package com.rlk.mi.service;

import com.rlk.mi.entity.UserInfo;

import java.util.List;

/**
 * Created by lifei.ding on 15-6-25.
 */
public interface UserInfoService {
    Integer create(UserInfo userInfo);
    List<UserInfo> getAllList();
}
