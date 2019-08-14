package comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the business layer
 * @author rafael.goncalves
 */

public class UnauthorizedException extends Exception {

	private static final long serialVersionUID = 1L;

	HttpStatus httpStatus = HttpStatus.UNAUTHORIZED;

	public UnauthorizedException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public UnauthorizedException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public UnauthorizedException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public UnauthorizedException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}

}
