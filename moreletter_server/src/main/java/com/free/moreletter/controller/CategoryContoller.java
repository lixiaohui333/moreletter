/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.controller;

import com.free.moreletter.domain.CategoryVo;
import com.free.moreletter.domain.form.InsertCategoryForm;
import com.free.moreletter.exception.ExceptionResult;
import com.free.moreletter.exception.success.ErrorResult;
import com.free.moreletter.exception.success.SuccessResult;
import com.free.moreletter.manager.CategoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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


    @RequestMapping(value = "/category/list",method = RequestMethod.GET)
    public Object list() {
        List<CategoryVo> categoryVos = categoryManager.listCategory();
        return categoryVos;
    }


    @RequestMapping(value = "/category",method = RequestMethod.POST)
    public Object add(@Valid @RequestBody  InsertCategoryForm form) {

        Long categoryId = categoryManager.add(form.getName());

        return new CategoryVo(categoryId,form.getName());
    }

}