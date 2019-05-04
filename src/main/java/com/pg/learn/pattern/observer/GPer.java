package com.pg.learn.pattern.observer;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK提供的一种观察者的实现方式，被观察者
 * Created by Tom on 2019/3/17.
 */
public class GPer{

    private String name = "GPer生态圈";

    private Question question;

    private Student student;

    private List<Teacher> teachers = new ArrayList<>();

    public GPer (Student student, Question question) {
        System.out.println("学生"+student.getName() +"在"+name+ "提出问题："+question.getContent() );
        this.student = student;
        this.question = question;
    }

    public void addObserver(Teacher teacher) {
        teachers.add(teacher);
    }

    public void publishQuestion(){

        EventBus eventBus = new EventBus();
        for(Teacher teacher:teachers){
            eventBus.register(teacher);
        }
        eventBus.post(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
