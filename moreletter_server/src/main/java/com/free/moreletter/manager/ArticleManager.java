package com.free.moreletter.manager;

import com.free.moreletter.domain.article.ArticleVo;
import com.free.moreletter.domain.article.TagVo;

import java.util.List;

public interface ArticleManager {

    List<TagVo> getTagList();

    TagVo addTag(String name);


    ArticleVo getArticleById(Long id);

    List<ArticleVo> getArticleList(Long uid);



}
