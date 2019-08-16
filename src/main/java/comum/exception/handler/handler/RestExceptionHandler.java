package comum.exception.handler.handler;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import comum.exception.handler.domain.StandardError;
import comum.exception.handler.general.GenericException;
import lombok.extern.slf4j.Slf4j;

/**
 * Generic class that will intercept the error thrown in the access layers or integrations.
 * @author rafael.goncalves
 */
@ControllerAdvice 
@Slf4j
public class RestExceptionHandler {

	@ExceptionHandler(GenericException.class)
	public ResponseEntity<StandardError> trustHubException(GenericException e, HttpServletRequest request) {
		StandardError err = new StandardError(new Timestamp(System.currentTimeMillis()), e.getGenericError().getErrorDescription(), e.getMessage());		
		if(e != null && e.getMessage() != null) {
			if(e.getMessage().contains(Constants.TIMESTAMP)){
				String erro = e.getMessage().substring(e.getMessage().indexOf(Constants.OPEN_KEY), e.getMessage().lastIndexOf(Constants.CLOSE_KEY)+1);
				erro = erro.replaceAll(Constants.DOUBLE_QUOTES + Constants.STATUS +  Constants.DOUBLE_QUOTES, Constants.DOUBLE_QUOTES + Constants.ERRO_CODE +  Constants.DOUBLE_QUOTES);
				erro = erro.replaceAll(Constants.DOUBLE_QUOTES + Constants.ERROR +  Constants.DOUBLE_QUOTES, Constants.DOUBLE_QUOTES + Constants.ERROR_DESCRIPTION +  Constants.DOUBLE_QUOTES);
				err = StandardError.getStandardError(erro);
				log.error(err.getMessage());
			}
		}
		String msgErro = new StringBuilder("HEADER: ").append(e.getHttpStatus()).append(" BODY: ").append(err.getMessage()).toString();
		log.error(msgErro, e); 
		return ResponseEntity.status(e.getHttpStatus()).body(err);
		//return ResponseEntity.status(e.getHttpStatus()).body(err);
	}
}
