/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.domain.article;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.free.moreletter.domain.BaseVo;

/**
 *
 * @author veniayang
 * @version $Id: UserVo.java, v 0.1 2019年02月24日 17:57 veniayang Exp $
 */
public class TagVo extends BaseVo {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}