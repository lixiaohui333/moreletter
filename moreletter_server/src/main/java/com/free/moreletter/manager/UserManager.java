/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.manager;

import com.free.moreletter.domain.UserVo;
import com.free.moreletter.domain.form.LoginByPhoneForm;
import com.free.moreletter.domain.form.LoginByPlatForm;
import com.free.moreletter.domain.form.RegistForm;

import java.util.List;
import java.util.Map;

/**
 *
 * @author veniayang
 * @version $Id: UserManager.java, v 0.1 2019年02月24日 17:53 veniayang Exp $
 */
public interface UserManager {

    /**
     * 创建用户
     * 
     * @param userVO
     * @return
     */
    public boolean createUser(UserVo userVO);

    /**
     * 用户列表
     * 
     * @return
     */
    public List<UserVo> listUser();

    /**
     * 删除用户
     * 
     * @param userVo
     * @return
     */
    public boolean deleteUser(UserVo userVo);

    /**
     * 查询用户信息
     * 
     * @param userVo
     * @return
     */
    public boolean findUser(UserVo userVo);

//    public UserVo findUserByLogin(Map<String, Object> body);

    UserVo registUser(RegistForm body);

    UserVo findUserByPlat(LoginByPlatForm loginForm);
    UserVo findUserByPhone(LoginByPhoneForm loginForm);
}