package com.stackroute;

import com.stackroute.domain.Actor;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main
{
    public static void main( String[] args )
    {
         ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
         Movie m=context.getBean("movie",Movie.class);
         m.showInfo();


        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
        Movie m1=factory.getBean("movie",Movie.class);
        m.showInfo();

        BeanDefinitionRegistry beanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/beans.xml"));
        Movie m2=((DefaultListableBeanFactory) beanFactory).getBean(Movie.class);
        m.showInfo();

    }
}
