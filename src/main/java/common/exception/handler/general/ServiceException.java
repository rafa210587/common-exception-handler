package common.exception.handler.general;

import org.springframework.http.HttpStatus;

import common.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the service layer
 * 
 * @author alan.franco
 */
public class ServiceException extends GenericException {

	private static final long serialVersionUID = 1L;

	public ServiceException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public ServiceException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public ServiceException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public ServiceException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}

}
