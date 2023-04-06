package sample04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample04.SungJuk;

public class HelloSpring {
	
	public void menu(ApplicationContext context) {
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk = null;
		List<SungJukDTO2> lsit = new ArrayList<SungJukDTO2>();
		
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 끝");
			
			System.out.print("번호 입력 : ");
			int num = scan.nextInt();
			if(num == 5) {
				break;
			}
			else if(num == 1) {
				sungJuk =(SungJuk)context.getBean("sungJukInput");
				//SungJukInput sungJukInput = new SungJukInput();
			}
			else if(num == 2) {
				sungJuk =(SungJuk)context.getBean("sungJukOutput");
				//SungJukOutput sungJukOutput = new SungJukOutput();
			}
			else if(num == 3) {
				sungJuk =(SungJuk)context.getBean("sungJukUpdate");
			}
			else if(num == 4){
				sungJuk =(SungJuk)context.getBean("sungJukDelete");
			}
			sungJuk.execute(); //호출
		}
		
	} // menu()

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
		
		helloSpring.menu(context);
		System.out.println("프로그램을 종료합니다.");
		
	}


}
