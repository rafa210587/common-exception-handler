package common.exception.handler.integration;

import org.springframework.http.HttpStatus;

import common.exception.handler.domain.GenericError;
import common.exception.handler.general.GenericException;


/**
 * Exception that will occur in internal integration 
 * @author rafael.goncalves
 */
public class InternalIntegrationException extends GenericException {

	private static final long serialVersionUID = 1L;

	public InternalIntegrationException(String msg, GenericError trustError) {
		super(msg, trustError);
	}

	public InternalIntegrationException(String msg, GenericError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public InternalIntegrationException(String msg, GenericError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public InternalIntegrationException(String msg, GenericError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
