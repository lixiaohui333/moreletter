/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 *
 * @author veniayang
 * @version $Id: UserVo.java, v 0.1 2019年02月24日 17:57 veniayang Exp $
 */
public class UserVo extends BaseVo {


    private Long id;

    private String name;

    private String nick;

    private Long avatar;

    private String phone;

    private String desc;

    private String email;

    @JsonIgnore
    private String password;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>nick</tt>.
     *
     * @return property value of nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param nick value to be assigned to property nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * Getter method for property <tt>avatar</tt>.
     *
     * @return property value of avatar
     */
    public Long getAvatar() {
        return avatar;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param avatar value to be assigned to property avatar
     */
    public void setAvatar(Long avatar) {
        this.avatar = avatar;
    }

    /**
     * Getter method for property <tt>phone</tt>.
     *
     * @return property value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param phone value to be assigned to property phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Getter method for property <tt>email</tt>.
     *
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method for property <tt>password</tt>.
     *
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }


}