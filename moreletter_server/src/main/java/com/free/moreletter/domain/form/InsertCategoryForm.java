package com.free.moreletter.domain.form;


import com.free.moreletter.domain.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class InsertCategoryForm extends ToString {

    @NotEmpty
    @Size(min = 2,max =10,message = "目录名称过长")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
