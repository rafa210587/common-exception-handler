package common.exception.handler.general;

import org.springframework.http.HttpStatus;

import common.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the business layer
 * @author rafael.goncalves
 */

public class ServiceUnavailableException extends GenericException {

	private static final long serialVersionUID = 1L;

	HttpStatus httpStatus = HttpStatus.SERVICE_UNAVAILABLE;

	public ServiceUnavailableException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public ServiceUnavailableException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public ServiceUnavailableException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public ServiceUnavailableException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}

}
