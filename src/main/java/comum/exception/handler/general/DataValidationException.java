package comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in data validation
 * 
 * @author rafael.goncalves
 */
public class DataValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	public DataValidationException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public DataValidationException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public DataValidationException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public DataValidationException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}
}
