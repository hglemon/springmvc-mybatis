package com.rlk.mi.dao;

import com.rlk.mi.entity.UserAccount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface UserAccountMapper {
    @Insert("INSERT into userAccount (email, password, status, uid) VALUES (#{email}, #{password}, #{status}, #{uid})")
    public void insert(UserAccount userAccount);

    @Select("SELECT * from userAccount WHERE email = #{email}")
    public UserAccount get(@Param("email") String email);

    @Select("SELECT * from userAccount")
    public List<UserAccount> getAll();
}