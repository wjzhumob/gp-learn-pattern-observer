package com.pg.learn.pattern.observer;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * Created by Tom on 2019/3/17.
 */
public class Teacher {
    private String name;
    public Teacher(String name){
        this.name = name;
    }

    @Subscribe
    public void Subscribe(Object arg) {
        GPer gPer = (GPer)arg;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
        "您收到了一个来自“"+ gPer.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                gPer.getQuestion().getContent() + "\n" +
        "提问者：" + gPer.getStudent().getName());
    }
}
