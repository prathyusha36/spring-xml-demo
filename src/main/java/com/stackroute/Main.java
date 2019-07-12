package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie movie=(Movie)applicationContext.getBean("movie");
        movie.setApplicationContext(applicationContext);
        movie.setBeanName("prathyusha");

        System.out.println(movie.getActor());

        BeanFactory xmlBeanFactory=new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
        Movie movieFirst=(Movie)xmlBeanFactory.getBean("movie");
        movieFirst.setBeanFactory(xmlBeanFactory);
        movieFirst.setBeanName("maggi");



    }
}
