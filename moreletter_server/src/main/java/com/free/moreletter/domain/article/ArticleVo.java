/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.domain.article;

import com.free.moreletter.domain.BaseVo;

/**
 *
 * @author veniayang
 * @version $Id: UserVo.java, v 0.1 2019年02月24日 17:57 veniayang Exp $
 */
public class ArticleVo extends BaseVo {

    private Long id;
    private String name;
    private String desc;
    private String tagIds;
    private Long categoryId;
    private Long userId;
    private Integer isPrivate;
    private String content;

}