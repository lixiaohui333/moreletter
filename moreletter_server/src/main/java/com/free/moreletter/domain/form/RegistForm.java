package com.free.moreletter.domain.form;


import com.free.moreletter.domain.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class RegistForm extends ToString {

    @NotEmpty
    @Size(min = 3,max = 11,message = "请输入正确的手机号")
    private String phone;

    @NotEmpty
    @Size(min = 3,max = 20,message = "请设置3-20位密码")
    private String password;

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
