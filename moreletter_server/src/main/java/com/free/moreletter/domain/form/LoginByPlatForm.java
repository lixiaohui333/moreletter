package com.free.moreletter.domain.form;


import com.free.moreletter.domain.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginByPlatForm extends ToString {

    @NotEmpty
    private String type;

    @NotEmpty
    private String openId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
