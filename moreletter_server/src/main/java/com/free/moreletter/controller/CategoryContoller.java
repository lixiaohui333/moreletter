/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.controller;

import com.free.moreletter.domain.CategoryVo;
import com.free.moreletter.manager.CategoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author veniayang
 * @version $Id: UserContoller.java, v 0.1 2019年02月24日 12:28 veniayang Exp $
 */

@RestController
public class CategoryContoller {
    
    @Autowired
    CategoryManager categoryManager;
    

    @RequestMapping("/category/list")
    public Object listUser() {

        List<CategoryVo> categoryVos = categoryManager.listCategory();

        return categoryVos;
    }

}