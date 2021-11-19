package com.baomidou.ant.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 冰
 * @since 2021-11-19
 */
@ApiModel("用户实体类")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId("Id")
    private Integer Id;
    /**
     * 用户名
     */
    @TableField("UserName")
    private String UserName;
    /**
     * 密码
     */
    @TableField("PassWord")
    private String PassWord;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    @Override
    public String toString() {
        return "User{" +
        ", Id=" + Id +
        ", UserName=" + UserName +
        ", PassWord=" + PassWord +
        "}";
    }
}
