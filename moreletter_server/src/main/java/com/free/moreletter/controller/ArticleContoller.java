/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.controller;

import com.free.moreletter.domain.CategoryVo;
import com.free.moreletter.domain.article.ArticleVo;
import com.free.moreletter.domain.article.TagVo;
import com.free.moreletter.domain.form.GetArticleByIdForm;
import com.free.moreletter.domain.form.GetArticleListForm;
import com.free.moreletter.domain.form.InsertCategoryForm;
import com.free.moreletter.domain.form.InsertTagForm;
import com.free.moreletter.manager.ArticleManager;
import com.free.moreletter.manager.CategoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *
 * @author veniayang
 * @version $Id: UserContoller.java, v 0.1 2019年02月24日 12:28 veniayang Exp $
 */

@RestController
public class ArticleContoller {
    
    @Autowired
    ArticleManager articleManager;


    @RequestMapping(value = "/tag/list",method = RequestMethod.GET)
    public Object list() {
        List<TagVo> tagVos = articleManager.getTagList();

        return tagVos;
    }


    @RequestMapping(value = "/tag",method = RequestMethod.POST)
    public Object add(@Valid @RequestBody InsertTagForm form) {

        TagVo tagVo = articleManager.addTag(form.getName());

        return tagVo;
    }


    @RequestMapping(value = "/article/list",method = RequestMethod.GET)
    public Object articleList(@Valid @RequestBody GetArticleListForm form) {

        List<ArticleVo> articleVoList = articleManager.getArticleList(form.getUserId());

        return articleVoList;
    }


    @RequestMapping(value = "/article/{id}",method = RequestMethod.GET)
    public Object getArticleById(@Valid @PathVariable("id") Long id) {

        ArticleVo articleVo = articleManager.getArticleById(id);

        return articleVo;
    }

}