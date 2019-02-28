package com.free.moreletter.domain.form;


import com.free.moreletter.domain.ToString;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginForm extends ToString {

    @NotEmpty(message = "空了")
    @Size(min=1,max = 11,message = "请输入正确的手机号")
    private String phone;

//    @NotEmpty
//    @Size(min = 4,max=20,message = "请输入4-20位密码")
//    private String password;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
