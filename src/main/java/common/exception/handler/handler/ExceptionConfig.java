package common.exception.handler.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ExceptionConfig {

	@Bean
	public RestExceptionHandler getHandler() {
		return new RestExceptionHandler() {
		};
	}
}
