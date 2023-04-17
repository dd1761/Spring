package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sample01.LoggingAdvice;
import sample01.MessageBeanImpl;

@Configuration
@EnableAspectJAutoProxy //xml파일에 aop:aspectj-autoproxy와 같은 일을 한다.
public class SpringConfiguration {
	
	@Bean
	public MessageBeanImpl messageBeanImpl(){
		
		return new MessageBeanImpl();
	}
	
	@Bean
	public LoggingAdvice loggingAdvice() {
		
		return new LoggingAdvice();
	}
}
