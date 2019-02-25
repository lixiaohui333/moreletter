/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.manager.impl;

import com.free.moreletter.dao.mapper.ThirdPlatformInfoDoMapper;
import com.free.moreletter.dao.mapper.UserDoMapper;
import com.free.moreletter.dao.model.ThirdPlatformInfoDo;
import com.free.moreletter.dao.model.ThirdPlatformInfoDoExample;
import com.free.moreletter.dao.model.UserDo;
import com.free.moreletter.dao.model.UserDoExample;
import com.free.moreletter.domain.UserVo;
import com.free.moreletter.manager.UserManager;
import com.free.moreletter.util.AssertUtil;
import com.free.moreletter.util.CommonConvertor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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


    @Autowired
    ThirdPlatformInfoDoMapper thirdPlatformManager;
    
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
        UserDoExample example = new UserDoExample();
        UserDoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo("123"); // name=123
        criteria.andStateIn(Arrays.asList("normal", "locked", "deleted")); // and state in ("normal", "locked", "deleted")
        
        UserDoExample.Criteria or = example.or();
        or.andNameEqualTo("321"); // or name=321
        
        // select * from ml_user where (name=123 and state in ("normal", "locked", "deleted")) or (name=321)
        
        List<UserDo> userDos = userDoMapper.selectByExample(example);
        
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
        AssertUtil.notNull(userVo, "userVo为空");

        return false;
    }

    @Override
    public UserVo findUserByLogin(Map<String, Object> body) {


        List<UserDo> userDos =null;

        UserDoExample example =new UserDoExample();
        UserDoExample.Criteria criteria = example.createCriteria();
        if(!body.containsKey("type")){
            criteria.andPhoneEqualTo((String) body.getOrDefault("phone",""));
            criteria.andPasswordEqualTo((String) body.getOrDefault("password",""));
            userDos=userDoMapper.selectByExample(example);
        }
        else{
            String type = (String) body.getOrDefault("type","");
            String openId = (String) body.getOrDefault("openId","");
            ThirdPlatformInfoDoExample platformInfoDoExample = new ThirdPlatformInfoDoExample();
            ThirdPlatformInfoDoExample.Criteria thirdCriteria = platformInfoDoExample.createCriteria();
            thirdCriteria.andOpenIdEqualTo(openId);
            thirdCriteria.andTypeEqualTo(type);

            List<ThirdPlatformInfoDo> thirdPlatformInfoDos = thirdPlatformManager.selectByExample(platformInfoDoExample);
            if(thirdPlatformInfoDos.size()>0){
                ThirdPlatformInfoDo platformInfoDo = thirdPlatformInfoDos.get(0);

                criteria.andIdEqualTo(platformInfoDo.getUserId());
                userDos=userDoMapper.selectByExample(example);
            }
        }

        UserVo userVo = null;
        if(userDos!=null &&userDos.size()>0){
            userVo = new UserVo();
            CommonConvertor.convert(userDos.get(0),userVo);
        }

        return userVo;
    }
}