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
import com.free.moreletter.domain.form.LoginByPhoneForm;
import com.free.moreletter.domain.form.LoginByPlatForm;
import com.free.moreletter.domain.form.RegistForm;
import com.free.moreletter.exception.exception.PhoneExistException;
import com.free.moreletter.manager.UserManager;
import com.free.moreletter.util.AssertUtil;
import com.free.moreletter.util.CommonConvertor;
import com.free.moreletter.util.TextUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

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
//        UserDoExample.Criteria criteria = example.createCriteria();
//        criteria.andNameEqualTo("123"); // name=123
//        criteria.andStateIn(Arrays.asList("normal", "locked", "deleted")); // and state in ("normal", "locked", "deleted")
//
//        UserDoExample.Criteria or = example.or();
//        or.andNameEqualTo("321"); // or name=321

        // select * from ml_user where (name=123 and state in ("normal", "locked", "deleted")) or (name=321)

        List<UserDo> userDos = userDoMapper.selectByExample(example);

        List<UserVo> result = new ArrayList<>();
        userDos.forEach((userDo) -> {
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
    public UserVo registUser(RegistForm form) {


        UserDo userDo = new UserDo();
        CommonConvertor.convert(form,userDo);
        userDo.setName(form.getPhone());
        int insert = userDoMapper.insert(userDo);

        if(insert==0){
            throw new PhoneExistException();
        }

        UserVo userVo =new UserVo();
        CommonConvertor.convert(userDo,userVo);

        return userVo;
    }

//    @Override
//    public UserVo findUserByLogin(Map<String, Object> body) {
//        List<UserDo> userDos =null;
//
//        UserDoExample example =new UserDoExample();
//        UserDoExample.Criteria criteria = example.createCriteria();
//        if(!body.containsKey("type")){
//
//            criteria.andPhoneEqualTo((String) body.getOrDefault("phone",""));
////            criteria.andPasswordEqualTo((String) body.getOrDefault("password",""));
//            userDos=userDoMapper.selectByExample(example);
//
//        }
//        else{
//            String type = (String) body.getOrDefault("type","");
//            String openId = (String) body.getOrDefault("openId","");
//            ThirdPlatformInfoDoExample platformInfoDoExample = new ThirdPlatformInfoDoExample();
//            ThirdPlatformInfoDoExample.Criteria thirdCriteria = platformInfoDoExample.createCriteria();
//            thirdCriteria.andOpenIdEqualTo(openId);
//            thirdCriteria.andTypeEqualTo(type);
//
//            List<ThirdPlatformInfoDo> thirdPlatformInfoDos = thirdPlatformManager.selectByExample(platformInfoDoExample);
//            if(thirdPlatformInfoDos.size()>0){
//                ThirdPlatformInfoDo platformInfoDo = thirdPlatformInfoDos.get(0);
//
//                criteria.andIdEqualTo(platformInfoDo.getUserId());
//                userDos=userDoMapper.selectByExample(example);
//            }
//        }
//
//        UserVo userVo = null;
//        if(userDos!=null &&userDos.size()>0){
//            userVo = new UserVo();
//            CommonConvertor.convert(userDos.get(0),userVo);
//        }
//
//        return userVo;
//    }


    @Override
    public UserVo findUserByPlat(LoginByPlatForm loginForm) {
        UserDoExample example = new UserDoExample();
        UserDoExample.Criteria criteria = example.createCriteria();

        ThirdPlatformInfoDoExample platformInfoDoExample = new ThirdPlatformInfoDoExample();
        ThirdPlatformInfoDoExample.Criteria thirdCriteria = platformInfoDoExample.createCriteria();
        thirdCriteria.andOpenIdEqualTo(loginForm.getOpenId());
        thirdCriteria.andTypeEqualTo(loginForm.getType());

        List<ThirdPlatformInfoDo> thirdPlatformInfoDos = thirdPlatformManager.selectByExample(platformInfoDoExample);
        if (thirdPlatformInfoDos.size() > 0) {
            ThirdPlatformInfoDo platformInfoDo = thirdPlatformInfoDos.get(0);
            criteria.andIdEqualTo(platformInfoDo.getUserId());
            List<UserDo> userDos = userDoMapper.selectByExample(example);

            return getUserVo(userDos);
        } else {

            UserDo userDo = new UserDo();
            userDo.setGmtCreate(new Date());
            userDo.setGmtModified(new Date());
            userDo.setCreator("plat");
            userDo.setState("ok");

            userDo.setName(loginForm.getOpenId());
            String password = (new Date().getTime() + "").substring(1, 6);
            userDo.setPassword(password);

            userDoMapper.insert(userDo);


            ThirdPlatformInfoDo infoDo = new ThirdPlatformInfoDo();
            infoDo.setCreator("plat");
            infoDo.setGmtModified(new Date());
            infoDo.setGmtCreate(new Date());
            infoDo.setState("ok");
            infoDo.setType(loginForm.getType());
            infoDo.setOpenId(loginForm.getOpenId());
            infoDo.setUserId(userDo.getId());

            thirdPlatformManager.insert(infoDo);

            UserVo userVo = new UserVo();
            CommonConvertor.convert(userDo, userVo);
            return userVo;
        }


    }

    private UserVo getUserVo(List<UserDo> userDos) {
        UserVo userVo = null;
        if (userDos != null && userDos.size() > 0) {
            userVo = new UserVo();
            CommonConvertor.convert(userDos.get(0), userVo);
        }

        return userVo;
    }

    @Override
    public UserVo findUserByPhone(LoginByPhoneForm loginForm) {


        UserDoExample example = new UserDoExample();
        UserDoExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(loginForm.getPhone());

        List<UserDo> userDos = userDoMapper.selectByExample(example);

        return getUserVo(userDos);
    }
}