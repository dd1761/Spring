package sample04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SungJukOutput implements SungJuk {
	
	@Autowired
	@Qualifier("arrayList") //List를 자식인 arrayList로 캐스팅하여 받겠다
	private List<SungJukDTO2> list = null;
	//private ArrayList<SungJukDTO2> list = null;
	
	@Override
	public void execute() {
		
		System.out.println();
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO2 sungJukDTO2 : list) {
			System.out.println(sungJukDTO2);
		} //for
		
	}

}
