package com.rlk.mi.service;

import com.rlk.mi.entity.UserInfo;
import com.rlk.mi.dao.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lifei.ding on 15-6-25.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource(name = "userInfoMapper")
    private UserInfoMapper userInfoMapper;
    @Override
    public Integer create(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
        return 1;
    }
    @Override
    public List<UserInfo> getAllList() {
        List<UserInfo> userInfo = userInfoMapper.getAll();
        return userInfo;
    }

}
