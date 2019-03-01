package com.free.moreletter.domain.form;


import com.free.moreletter.domain.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class GetArticleByIdForm extends ToString {


    @NotEmpty
    @Min(value = 1,message = "请输入有效的文章Id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
