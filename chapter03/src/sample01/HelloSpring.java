package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("acQuickStart.xml");
		MessageBean messageBean = (MessageBean)context.getBean("messageBeanImpl");
		
		//before 앞에만 끼는 메소드
//		messageBean.showPrintBefore();
//		System.out.println();
//		messageBean.viewPrintBefore();
//		System.out.println();
//		messageBean.display();
		
		//After 뒤에만 끼는 메소드
//		messageBean.showPrintAfter();
//		System.out.println();
//		messageBean.viewPrintAfter();
//		System.out.println();
//		messageBean.display();
		
		//Around 앞뒤로 끼는 메소드
		messageBean.showPrint();
		System.out.println();
		messageBean.viewPrint();
		System.out.println();
		messageBean.display();
		
		
	}
	
}
