package com.free.moreletter.domain.form;


import com.free.moreletter.domain.ToString;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginByPhoneForm extends ToString {

    @NotEmpty
    @Size(min=3,max = 11,message = "请输入3-11位手机号")
    private String phone;

    @NotEmpty
    @Size(min = 1,max=20,message = "请输入1-20位密码")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
