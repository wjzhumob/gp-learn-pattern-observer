package com.pg.learn.pattern.observer;

import java.util.Date;

/**
 * Created by Tom on 2019/3/17.
 */
public class Question {

    private String content;

    private Date createDate;

    public Question(String content) {
        this.content = content;
        this.createDate = new Date();
    }

    public String getContent() {
        return content;
    }
}
