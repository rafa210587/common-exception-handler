package comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the control layer
 * @author rafael.goncalves
 */
public class ControllerException extends Exception {

	private static final long serialVersionUID = 1L;

	public ControllerException(String msg, GenericError trustError) {
		super(msg, trustError);
	}

	public ControllerException(String msg, GenericError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public ControllerException(String msg, GenericError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public ControllerException(String msg, GenericError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
