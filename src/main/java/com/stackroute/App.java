package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        BeanLifeCycleDemoBean beanLifeCycleDemoBean=(BeanLifeCycleDemoBean)context.getBean("lifecycle");
        BeanPostProcessorDemoBean demo=(BeanPostProcessorDemoBean)context.getBean("postprocessor");

        }
}
