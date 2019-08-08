package com.trust.comum.exception.handler.integration;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.GenericError;
import com.trust.comum.exception.handler.general.Exception;


/**
 * Exception that will occur in external integration 
 * @author alan.franco
 */
public class ExternalIntegrationException extends Exception {

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
