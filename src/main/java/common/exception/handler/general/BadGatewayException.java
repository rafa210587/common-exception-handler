package common.exception.handler.general;

import org.springframework.http.HttpStatus;

import common.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the business layer
 * @author rafael.goncalves
 */

public class BadGatewayException extends GenericException {

	private static final long serialVersionUID = 1L;

	HttpStatus httpStatus = HttpStatus.BAD_GATEWAY;

	public BadGatewayException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public BadGatewayException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public BadGatewayException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public BadGatewayException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}

}
