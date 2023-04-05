package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 

		Calc calcAdd = (Calc)context.getBean("calcAdd");
		Calc calcMul = (Calc)context.getBean("calcMul");
		
		calcAdd.calculate(25,36);
		calcMul.calculate(25,36);
	}

}
