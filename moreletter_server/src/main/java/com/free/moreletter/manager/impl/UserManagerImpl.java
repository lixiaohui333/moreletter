/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.manager.impl;

import com.free.moreletter.dao.mapper.UserDoMapper;
import com.free.moreletter.dao.model.UserDo;
import com.free.moreletter.dao.model.UserDoExample;
import com.free.moreletter.domain.UserVo;
import com.free.moreletter.manager.UserManager;
import com.free.moreletter.util.AssertUtil;
import com.free.moreletter.util.CommonConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户管理器
 * 
 * @author veniayang
 * @version $Id: UserManagerImpl.java, v 0.1 2019年02月24日 18:08 veniayang Exp $
 */
@Component
public class UserManagerImpl implements UserManager {
    
    @Autowired
    UserDoMapper userDoMapper;
    
    /**
     * 创建用户
     *
     * @param userVO
     * @return
     */
    @Override
    public boolean createUser(UserVo userVO) {
        AssertUtil.notNull(userVO, "userVo为空");
        AssertUtil.notBlank(userVO.getName(), "name为空");
        AssertUtil.notBlank(userVO.getPassword(), "password为空");
        AssertUtil.notBlank(userVO.getCreator(), "creator为空");
        AssertUtil.notBlank(userVO.getState(), "state为空");

        UserDo userDo = new UserDo();
        CommonConvertor.convert(userVO, userDo);
        
        userDoMapper.insertSelective(userDo);
        
        return true;
    }

    /**
     * 用户列表
     *
     * @return
     */
    @Override
    public List<UserVo> listUser() {
        List<UserDo> userDos = userDoMapper.selectByExample(new UserDoExample());

        List<UserVo> result = new ArrayList<>();
        userDos.forEach((userDo)->{
            UserVo userVo = new UserVo();
            CommonConvertor.convert(userDo, userVo);
            result.add(userVo);
        });
        
        return result;
    }

    /**
     * 删除用户
     *
     * @param userVo
     * @return
     */
    @Override
    public boolean deleteUser(UserVo userVo) {
        return false;
    }

    /**
     * 查询用户信息
     *
     * @param userVo
     * @return
     */
    @Override
    public boolean findUser(UserVo userVo) {
        return false;
    }
}