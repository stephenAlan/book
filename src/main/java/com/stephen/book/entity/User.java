package com.stephen.book.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Created by ssc on 2020-09-02 17:00 .
 * Description:
 */
@TableName(value = "users")
@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private Date loginTime;
    private Date createTime;
    private Date updateTime;
    private Integer status;


}
