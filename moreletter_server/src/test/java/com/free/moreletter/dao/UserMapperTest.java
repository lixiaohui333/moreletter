/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.dao;

import com.free.moreletter.dao.mapper.UserDoMapper;
import com.free.moreletter.dao.model.UserDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

/**
 *
 * @author veniayang
 * @version $Id: UserMapperTest.java, v 0.1 2019年02月24日 16:55 veniayang Exp $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    
    @Autowired
    UserDoMapper userDoMapper;
    
    @Test
    public void testInsert() {
        UserDo user = new UserDo();
        user.setName("123");
        user.setCreator("admin");
        user.setDesc("test");
        user.setEmail("");
        user.setNick("test");
        user.setPassword("123");
        user.setState("test");
        user.setGmtCreate(Calendar.getInstance().getTime());
        user.setGmtModified(Calendar.getInstance().getTime());

        int result = userDoMapper.insert(user);
        System.out.println(result);
    }
}