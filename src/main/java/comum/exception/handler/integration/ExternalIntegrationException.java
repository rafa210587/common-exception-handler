package comum.exception.handler.integration;

import org.springframework.http.HttpStatus;

import comum.exception.handler.domain.GenericError;
import comum.exception.handler.general.GenericException;


/**
 * Exception that will occur in external integration 
 * @author rafael.goncalves
 */
public class ExternalIntegrationException extends GenericException {

	private static final long serialVersionUID = 1L;

	public ExternalIntegrationException(String msg, GenericError trustError) {
		super(msg, trustError);
	}

	public ExternalIntegrationException(String msg, GenericError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public ExternalIntegrationException(String msg, GenericError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public ExternalIntegrationException(String msg, GenericError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
