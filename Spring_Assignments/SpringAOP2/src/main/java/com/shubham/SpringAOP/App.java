package com.shubham.SpringAOP;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentService bean = getStudentBean();
        bean.getAllDetails();
        
        bean.getById(3);
    	
    }
    
    private static StudentService getStudentBean() {
        StudentService target = new StudentService();
        
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new AOPConfig());
        
        return (StudentService)factory.getProxy();
    }
}
