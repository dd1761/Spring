package sample01;

import lombok.Setter;

public class MessageBeanImpl implements MessageBean {
	@Setter
	private String str;

//	public void setStr(String str) {
//		this.str = str;
//	}

//	joinPoint는 전체가 된다.
//	pointCut은 showPrintBefore와 viewPrintBefore가 된다
	

	@Override
	public void showPrintBefore() {
//		pointCut
		System.out.println("showPrintBefore 메세지 = " + str); //핵심 코드
		
	}

	@Override
	public void viewPrintBefore() {
//		pointCut		
		try {
			Thread.sleep(1000);	//1초 - 단위 1/1000초
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("viewPrintBefore 메세지 = " + str); //핵심 코드

	}

	@Override
	public void display() {
		System.out.println("display 메세지 = " + str); //핵심 코드

	}

}
