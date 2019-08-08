package com.trust.comum.exception.handler.integration;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.TrustError;
import com.trust.comum.exception.handler.general.TrustException;


/**
 * Exception that will occur in internal integration 
 * @author alan.franco
 */
public class InternalIntegrationException extends TrustException {

	private static final long serialVersionUID = 1L;

	public InternalIntegrationException(String msg, TrustError trustError) {
		super(msg, trustError);
	}

	public InternalIntegrationException(String msg, TrustError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public InternalIntegrationException(String msg, TrustError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public InternalIntegrationException(String msg, TrustError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
