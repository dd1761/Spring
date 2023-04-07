package sample04;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukDelete implements SungJuk {
	@Setter
	private List<SungJukDTO2> list = null;
	
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력해주세요 : ");
		String name = scan.next();
		
		Iterator<SungJukDTO2> it = list.iterator();	
		int sw = 0;
		while(it.hasNext()) { //항목이 있으면 true 없으면 false
			SungJukDTO2 sungJukDTO2 = it.next();	
			//it가 가리키는 곳의 항목을 꺼내서 SungJukDTO2에 저장고 it는 다음항목으로 이동한다
			
			if(sungJukDTO2.getName().equals(name)){
				sw=1;
				it.remove();	//it가 SungDTO2에 보관한 항목을 제거
				
				System.out.println("삭제하였습니다.");
			}	//if
			
			
		}	//while
		if(sw==0) {
			System.out.println("찾고자 하는 이름이 없습니다.");
		}
	}

}
