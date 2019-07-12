package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;
    private ApplicationContext context=null;
    private BeanFactory beanFactory=null;
    public Movie() {

    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }
    @Override
    public String toString() {
        return "actor ="+actor;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        this.context=context;
    }
    @Override
    public  void setBeanName(String s) {
        System.out.println("bean name :"+s);

    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }
}
