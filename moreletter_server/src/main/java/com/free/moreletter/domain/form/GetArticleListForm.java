package com.free.moreletter.domain.form;


import com.free.moreletter.domain.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class GetArticleListForm extends ToString {


    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
