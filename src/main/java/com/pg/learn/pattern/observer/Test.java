package com.pg.learn.pattern.observer;

/**
 * @author wjzhu
 * @createDate 2019-05-04 22:19
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("wjzhu");
        Question question = new Question("观察者模式适合什么场景？");
        GPer gPer = new GPer(student,question);
        gPer.addObserver(new Teacher("Tom"));
        gPer.addObserver(new Teacher("Mic"));
        gPer.publishQuestion();
    }
}
