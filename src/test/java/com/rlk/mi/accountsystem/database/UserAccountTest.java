package com.rlk.mi.accountsystem.database;import javax.annotation.Resource;import com.rlk.mi.dao.UserAccountMapper;import org.junit.Test;import org.junit.runner.RunWith;import org.springframework.test.context.ContextConfiguration;import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;@RunWith(SpringJUnit4ClassRunner.class)@ContextConfiguration(locations = {        "file:src/main/resources/mybatis-context.xml",        "file:src/main/resources/servlet-context.xml",})public class UserAccountTest extends AbstractJUnit4SpringContextTests {    @Resource    private UserAccountMapper userAccountMapper;    @Test    public void saveTest() {//        List<UserAccount> userAccounts = userAccountMapper.getAll();//        for(UserAccount userAccount : userAccounts) {//            System.out.println(userAccount.getEmail()+", "+userAccount.getPassword()+", "+userAccount.getStatus()+", "+userAccount.getUid());//        }        System.out.println("----------insert before-------");//        UserAccount userAccount = new UserAccount();//        userAccount.setEmail("testuser@demo.com");//        userAccount.setPassword("huewiahdgsyde121");//        userAccount.setStatus(0);//        userAccount.setUid(12361872);//        userAccountMapper.insert(userAccount);        System.out.println("----------insert end-------");    }}