/**
 * 
 */
package com.apex.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.apex.server.BasicCalc;
import com.apex.server.Calc;

/**
 * @author Ramy
 *
 */
public class BasicClient {

	/**
	 * @param args
	 */
	
	Calc calc = null;

	public static void main(String[] args) {
		BasicClient client = (BasicClient) getBeanFactory().getBean("client");
		client.callOpertations();

	}

	public  void callOpertations() {
		int var1 = calc.add(10,2);
		int var2 = calc.subtract(10,2);
		int var3 = calc.prod(10,2);
		int var4 = calc.div(10,2);

		System.out.println("Addition "+ var1);
		System.out.println("Subtraction "+ var2);
		System.out.println("Multiplication "+ var3);
		System.out.println("Division "+ var4);
	}

	public Calc getCalc() {
		return calc;
	}

	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	public static BeanFactory getBeanFactory() {
		Resource resource = new FileSystemResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		return beanFactory;
		
	}

}
