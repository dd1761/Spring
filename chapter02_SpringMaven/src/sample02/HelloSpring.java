package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calc caclAdd = (Calc)context.getBean("calcAdd");
		Calc calcMul = (Calc)context.getBean("calcMul");
		
		caclAdd.calculate();
		calcMul.calculate();
	}

}
