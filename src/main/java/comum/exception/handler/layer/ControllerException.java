package comum.exception.handler.layer;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;
import comum.exception.handler.general.GenericException;

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
