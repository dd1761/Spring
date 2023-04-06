package sample04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;


public class SungJukInput implements SungJuk {
	@Setter
	private SungJukDTO2 sungJukDTO2 = null;
	
	@Setter
	private List<SungJukDTO2> list = null; //null값을 쥐고 있다. 
	
	
//	public void setList(List<SungJukDTO2> list) {
//		this.list = list;
//	}
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이  름 입력 : ");
		String name = scan.next();
		
		System.out.print("국어점수 입력 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어점수 입력 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학점수 입력 : ");
		int math = scan.nextInt();
		
		System.out.println();
		
		int tot = kor +  eng + math;
		double avg = tot / 3.0;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		
		//ArrayList에 담기
		//List<E> list = new ArrayList();
		list.add(sungJukDTO2);
		
		//출력
		System.out.println(name + "님의 데이터를 저장하였습니다.");
	}

	

}