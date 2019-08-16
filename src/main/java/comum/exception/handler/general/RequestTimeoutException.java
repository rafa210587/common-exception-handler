package comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the business layer
 * @author rafael.goncalves
 */

public class RequestTimeoutException extends GenericException {

	private static final long serialVersionUID = 1L;

	HttpStatus httpStatus = HttpStatus.REQUEST_TIMEOUT;

	public RequestTimeoutException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public RequestTimeoutException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public RequestTimeoutException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public RequestTimeoutException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}

}
