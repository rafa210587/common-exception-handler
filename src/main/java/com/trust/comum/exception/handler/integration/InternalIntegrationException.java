package com.trust.comum.exception.handler.integration;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.GenericError;
import com.trust.comum.exception.handler.general.Exception;


/**
 * Exception that will occur in internal integration 
 * @author alan.franco
 */
public class InternalIntegrationException extends Exception {

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
