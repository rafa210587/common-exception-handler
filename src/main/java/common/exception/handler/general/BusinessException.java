package common.exception.handler.general;

import org.springframework.http.HttpStatus;

import common.exception.handler.domain.GenericError;

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
