package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calc calcMul = (Calc)context.getBean("calcMul");
		Calc caclAdd = (Calc)context.getBean("calcAdd");
		
		caclAdd.calculate();
		calcMul.calculate();
	}

}
