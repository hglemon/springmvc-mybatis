package com.rlk.mi.dao;import com.rlk.mi.entity.UserUnverified;import org.apache.ibatis.annotations.Insert;import org.apache.ibatis.annotations.Param;import org.apache.ibatis.annotations.Select;import java.util.List;public interface UserUnverifiedMapper {    @Insert("INSERT into userUnverified (token, email, date) VALUES (#{token}, #{email}, #{date})")    public void insert(UserUnverified userUnverified);    @Select("SELECT * from userUnverified WHERE token = #{token}")    public UserUnverified get(@Param("token") String token);    @Select("SELECT * from userUnverified")    public List<UserUnverified> getAll();}