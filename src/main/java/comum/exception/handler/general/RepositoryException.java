package comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the repository layer
 * 
 * @author rafael.goncalves
 */
public class RepositoryException extends GenericException {

	private static final long serialVersionUID = 1L;

	public RepositoryException(String msg, GenericError genericError) {
		super(msg, genericError);
	}

	public RepositoryException(String msg, GenericError genericError, Throwable cause) {
		super(msg, genericError, cause);
	}

	public RepositoryException(String msg, GenericError genericError, HttpStatus httpStatus) {
		super(msg, genericError, httpStatus);
	}

	public RepositoryException(String msg, GenericError genericError, HttpStatus httpStatus, Throwable cause) {
		super(msg, genericError, httpStatus, cause);
	}

}
