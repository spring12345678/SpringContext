package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.A;
import com.beans.B;
import com.beans.C;
import com.beans.D;
import com.beans.E;

public class Application {
	public static void main(String[] args) {
	System.out.println("Hello World!");
	// ctrl shift o to import
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring-bean.xml");
	A a=context.getBean("aid", A.class);

	System.out.println(a.getClass());
	System.out.println(a.hashCode());
	
	a.m1();
	ApplicationContext context1=new ClassPathXmlApplicationContext("new-spring-bean.xml");
	D d=context1.getBean("dd",D.class);
	System.out.println(a.getClass());
	System.out.println(a.hashCode());
	d.m4();
	System.out.println("--------Annotation approach below---------");

	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.beans");
	ctx.refresh();
	B ac = ctx.getBean(B.class);
	ac.m2();
	C ab=ctx.getBean(C.class);
	ab.m3();
	E ae=ctx.getBean(E.class);
	ae.m5();
}
}