package com.free.moreletter.manager.impl;

import com.free.moreletter.dao.mapper.ArticleDoMapper;
import com.free.moreletter.dao.mapper.TagDoMapper;
import com.free.moreletter.dao.model.ArticleDo;
import com.free.moreletter.dao.model.ArticleDoExample;
import com.free.moreletter.dao.model.TagDo;
import com.free.moreletter.dao.model.TagDoExample;
import com.free.moreletter.domain.article.ArticleVo;
import com.free.moreletter.domain.article.TagVo;
import com.free.moreletter.exception.exception.BusinessException;
import com.free.moreletter.manager.ArticleManager;
import com.free.moreletter.util.CommonConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArticleManagerImpl implements ArticleManager {

    @Autowired
    TagDoMapper tagDoMapper;

    @Autowired
    ArticleDoMapper articleDoMapper;

    @Override
    public List<TagVo> getTagList() {

        TagDoExample tagDoExample = new TagDoExample();
        TagDoExample.Criteria criteria = tagDoExample.createCriteria();

        List<TagDo> tagDos = tagDoMapper.selectByExample(tagDoExample);

        List<TagVo> resultTags = new ArrayList<>();
        for (TagDo tagDo :
                tagDos) {
            TagVo tagVo = new TagVo();
            CommonConvertor.convert(tagDo, tagVo);
            resultTags.add(tagVo);
        }

        return resultTags;
    }

    @Override
    public TagVo addTag(String name) {
        TagDo tagDo = new TagDo();
        tagDo.setName(name);
        try {
            tagDoMapper.insert(tagDo);
        } catch (Exception e) {
            throw new BusinessException();
        }
        TagVo tagVo = new TagVo();
        CommonConvertor.convert(tagDo, tagVo);

        return tagVo;
    }

    @Override
    public ArticleVo getArticleById(Long id) {

        ArticleDoExample doExample = new ArticleDoExample();
        ArticleDoExample.Criteria criteria = doExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<ArticleDo> articleDos = articleDoMapper.selectByExample(doExample);

        ArticleVo articleVo = null;
        if (articleDos.size() > 0) {
            articleVo = new ArticleVo();
            ArticleDo articleDo = articleDos.get(0);
            CommonConvertor.convert(articleDo, articleVo);
        }

        return articleVo;
    }

    @Override
    public List<ArticleVo> getArticleList(Long uid) {

        ArticleDoExample doExample = new ArticleDoExample();
        ArticleDoExample.Criteria criteria = doExample.createCriteria();
        criteria.andUserIdEqualTo(uid);

        List<ArticleDo> articleDos = articleDoMapper.selectByExample(doExample);
        List<ArticleVo> articleVoList = new ArrayList<>();
        for (ArticleDo articleDo:articleDos){
            ArticleVo articleVo = new ArticleVo();
            CommonConvertor.convert(articleDo,articleVo);
            articleVoList.add(articleVo);
        }

        return articleVoList;
    }
}
