package sample04;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukUpdate implements SungJuk {
	@Setter
	private List<SungJukDTO2> list = null;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 이름을 입력해주세요 : ");
		String name = scan.next();
		
		for(SungJukDTO2 sungJukDTO2 : list) {
			if(sungJukDTO2.getName().equals(name)) {
				System.out.println(sungJukDTO2);
				
				System.out.print("국어점수 입력 : ");
				int kor = scan.nextInt();
				
				System.out.print("영어점수 입력 : ");
				int eng = scan.nextInt();
				
				System.out.print("수학점수 입력 : ");
				int math = scan.nextInt();
				
				int tot = kor + eng+ math;
				
				double avg = tot / 3.0;
				
				sungJukDTO2.setKor(kor);
				sungJukDTO2.setEng(eng);
				sungJukDTO2.setMath(math);
				sungJukDTO2.setTot(tot);
				sungJukDTO2.setAvg(avg);
				
				System.out.println(name + "님의 데이터를 수정하였습니다.");
			}
			else {
				System.out.println("찾고자 하는 이름이 없습니다");
			}
		}
		
	}

}
