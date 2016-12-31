package com.vigi;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
@SuppressWarnings("deprecation")
public class Test {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("applicationContext.xml");  
	    @SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    student student=(student)factory.getBean("studentbean");  
	    student.displayInfo();  
}
}
