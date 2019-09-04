package common.exception.handler.general;

import org.springframework.http.HttpStatus;

import common.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the control layer
 * @author rafael.goncalves
 */
public class ControllerException extends GenericException {

	private static final long serialVersionUID = 1L;

	public ControllerException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public ControllerException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public ControllerException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public ControllerException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}

}
