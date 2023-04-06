package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;

@Configuration //환경설정 파일 - xml과 같은 취급을 받는 환경설정 파일이다.
public class SpringConfiguration {
	
	//sample01
	@Bean //함수에서 리턴되는 값을 Bean으로 설정
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	//sample02
	@Bean
	public CalcAdd calcAdd(){
		
		return new CalcAdd(22, 55);
	}
	
	
//	@Bean
//	public CalcMul calcMul(){
//		
//		return new CalcMul();
//	}
	
	@Bean(name="calcMul") //자바문법과 같이 이름을 calcMul이라고 지어줘도 된다.
	public CalcMul getCalcMul(){
		
		return new CalcMul();
	}
}

/*
@Bean
- 메소드에서 return 되는 값을 빈으로 생성해준다.
- 메소드의 이름은 반드시 빈의 id명으로 만들어야 한다.


*/