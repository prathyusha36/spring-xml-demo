package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"file:src/beans.xml"});
        BeanLifeCycleDemoBean beanLifeCycleDemoBean=(BeanLifeCycleDemoBean)context.getBean("BeanLifeCycleDemoBean");
        System.out.println(beanLifeCycleDemoBean.getMessage());
        context.registerShutdownHook();

    }
}
