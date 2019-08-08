package comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the service layer
 * 
 * @author alan.franco
 */
public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServiceException(String msg, GenericError trustError) {
		super(msg, trustError);
	}

	public ServiceException(String msg, GenericError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public ServiceException(String msg, GenericError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public ServiceException(String msg, GenericError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
