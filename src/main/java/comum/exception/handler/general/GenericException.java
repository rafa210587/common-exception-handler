package comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;

/**
 * Default class that will handle errors in exceptions
 * 
 * @author rafael.goncalves
 */

public class GenericException extends RuntimeException {

private static final long serialVersionUID = 1L;
	
	GenericError genericError;
	HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

	public GenericException(String msg, GenericError genericError) {
		super(msg);
		this.genericError = genericError;
	}

	public GenericException(String msg, GenericError genericError, Throwable cause) {
		super(msg, cause);
		this.genericError = genericError;
	}

	public GenericException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg);
		this.genericError = genericError;
		this.httpStatus = httpStatus;
	}

	public GenericException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, cause);
		this.genericError = genericError;
		this.httpStatus = httpStatus;
	}

	public GenericError getGenericError() {
		return genericError;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
