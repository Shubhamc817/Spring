package com.shubham.SpringAOP;

/*

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@Aspect
public class AOPConfig {
	
	
	     
	    @Pointcut(
	      "execution(public String com.shubham.SpringAOP.StudentService.getAllDetails(..))"
	    )
	    public void monitor() { }
	     
	    @Bean
	    public PerformanceMonitorInterceptor performanceMonitorInterceptor() {
	        return new PerformanceMonitorInterceptor(true);
	    }
	 
	    @Bean
	    public Advisor performanceMonitorAdvisor() {
	        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
	        pointcut.setExpression("com.shubham.SpringAOP.AopConfig.monitor()");
	        return new DefaultPointcutAdvisor(pointcut, performanceMonitorInterceptor());
	    }
	     
	    /*@Bean
	    public Student person(){
	        return new Person("John","Smith", LocalDate.of(1980, Month.JANUARY, 12));
	    }*/
	  /*
	    @Bean
	    public StudentService personService(){
	        return new StudentService();
	    }
}
*/

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class AOPConfig implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        // start the stop watch
        StopWatch sw = new StopWatch();
        sw.start(invocation.getMethod().getName());

        Object returnValue = invocation.proceed();

        sw.stop();
        dumpInfo(invocation, sw.getTotalTimeMillis());
        return returnValue;
    }

    private void dumpInfo(MethodInvocation invocation, long ms) {
        Method m = invocation.getMethod();
        Object target = invocation.getThis();
        Object[] args = invocation.getArguments();

        System.out.println("Executed method: " + m.getName());
        System.out.println("On object of type: " + target.getClass().getName());

        /*System.out.println("With arguments:");
        for (int x = 0; x < args.length; x++) {
            System.out.print("    > " + args[x]);
        }*/
       
        System.out.println("executed at "+new java.util.Date());

        System.out.println("Took total time: " + ms + " ms");
        
       if(m.getName()=="getAllDetails")
       { 
    		   Map<Integer,Student> list=new StudentService().getAllDetails();
    		   Iterator it = list.entrySet().iterator();
    	        while (it.hasNext()) {
    	            Map.Entry pair = (Map.Entry)it.next();
    	            System.out.println(pair.getKey() + " = " + pair.getValue());
    	        }
       }
       
       if(m.getName()=="getById") {
    	   Integer id= (Integer)args[0];
    	   
    	 if(new StudentService().getById(id)!=null)
    	 { 
    	   System.out.println(new StudentService().getById(id));
    	 }
    	 else {
    		 System.out.println("Student with id "+id+" doesnt exist");
    	 }
       }
        
    }
}

