package com.free.moreletter.domain.form;


import com.free.moreletter.domain.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class InsertTagForm extends ToString {

    @NotEmpty
    @Size(min = 2,max =10,message = "标签名称过长")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
