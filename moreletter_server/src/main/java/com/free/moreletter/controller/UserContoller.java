/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.controller;

import com.free.moreletter.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author veniayang
 * @version $Id: UserContoller.java, v 0.1 2019年02月24日 12:28 veniayang Exp $
 */

@RestController
public class UserContoller {
    
    @Autowired
    UserManager userManager;
    
    @RequestMapping("/")
    public String home() {
        return "this is home lxh";
    }
    
    @RequestMapping("/user/list")
    public Object listUser() {
        return userManager.listUser();
    }
    
}