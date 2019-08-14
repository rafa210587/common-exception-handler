package comum.exception.handler.handler;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import comum.exception.handler.domain.StandardError;
import comum.exception.handler.general.Exception;
import lombok.extern.slf4j.Slf4j;

/**
 * Generic class that will intercept the error thrown in the access layers or integrations.
 * @author rafael.goncalves
 */
@ControllerAdvice 
@Slf4j
public class IntegrationServiceExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<StandardError> trustHubException(Exception e, HttpServletRequest request) {
		StandardError err = new StandardError(new Timestamp(System.currentTimeMillis()), e.getGenericError().getErrorDescription(), e.getMessage());		
		if(e != null && e.getMessage() != null) {
			if(e.getMessage().contains("timestamp")	
					&& (e.getMessage().contains("status")) 
						&& (e.getMessage().contains("errorDescription") || e.getMessage().contains("error")) 
							&& e.getMessage().contains("message")){
				String erro = e.getMessage().substring(e.getMessage().indexOf("{"), e.getMessage().lastIndexOf("}")+1);
				erro = erro.replaceAll("\"" + "status" +  "\"", "\"" + "errorCode" +  "\"");
				erro = erro.replaceAll("\""  + "error" +  "\"", "\"" + "errorDescription" +  "\"");
				err = StandardError.getStandardError(erro);
				log.error(err.getMessage());
			}
		}
		String msgErro = new StringBuilder("HEADER: ").append(e.getHttpStatus()).append(" BODY: ").append(err.getMessage()).toString();
		log.error(msgErro, e);   
		return ResponseEntity.status(e.getHttpStatus()).body(err);
	}
}
