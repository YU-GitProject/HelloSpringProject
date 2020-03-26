package com.ycc.project.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *IoC 控制反转
 */
public class App {
	public static void main(String[] args) {
		
		//1 获得容器
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		 //获得内容 --不需要自己new，都是从spring容器获得
		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
		obj.printMessage();
		
		HelloWorld obj2 = (HelloWorld) context.getBean("HelloWorld2");
		obj2.printMessage();
		
		((AbstractApplicationContext) context).close();
	}
}
