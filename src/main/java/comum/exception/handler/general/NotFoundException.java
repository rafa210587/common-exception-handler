package comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the business layer
 * @author rafael.goncalves
 */

public class NotFoundException extends GenericException {

	private static final long serialVersionUID = 1L;

	HttpStatus httpStatus = HttpStatus.NOT_FOUND;

	public NotFoundException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public NotFoundException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public NotFoundException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public NotFoundException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}
	
	@Override
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	@Override
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
