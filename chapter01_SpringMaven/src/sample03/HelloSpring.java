package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		// 주소에서 src는 지워도 자동으로 찾을 수 있다.
		MessageBean messageBean = (MessageBean) context.getBean("messageBean"); // 부모 = 자식
		messageBean.sayHello("Spring");
		
		MessageBean messageBean2 = context.getBean("messageBean", MessageBean.class); // 부모 = 자식
		messageBean2.sayHello("Spring");
		
		MessageBean messageBean3 = (MessageBean) context.getBean("messageBean"); // 부모 = 자식
		messageBean3.sayHello("Spring");
	}

}
