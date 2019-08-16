package comum.exception.handler.layer;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;
import comum.exception.handler.general.GenericException;

/**
 * Exception that will occur in the business layer
 * @author rafael.goncalves
 */

public class BusinessException extends GenericException {

	private static final long serialVersionUID = 1L;

	public BusinessException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public BusinessException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public BusinessException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public BusinessException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}

}
