package com.kennyw.springbootdemo.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/4 0004
 */
@Data
public class User {

    private int id;

    private String userName;

    private int age;

    private Date ctm;

}
