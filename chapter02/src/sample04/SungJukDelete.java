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
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next();	
			
			if(sungJukDTO2.getName().equals(name)){
				it.remove();	//it.next()가 반환하는 항목을 지운다.
				
				System.out.println("삭제하였습니다.");
			}
		}	//while
	}

}
