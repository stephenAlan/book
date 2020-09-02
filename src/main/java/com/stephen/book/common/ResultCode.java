package com.stephen.book.common;

import lombok.Getter;

/**
 * Created by ssc on 2020-09-02 17:35 .
 * Description:
 */
@Getter
public enum ResultCode {

    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    USERNAME_PASSWORD_ERROR(1000,"用户名或密码错误"),

    ;
    private int code;
    private String msg;


    private ResultCode(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }


}
