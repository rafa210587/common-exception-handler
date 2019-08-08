package com.trust.comum.exception.handler.integration;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.TrustError;
import com.trust.comum.exception.handler.general.TrustException;


/**
 * Exception that will occur in external integration 
 * @author alan.franco
 */
public class ExternalIntegrationException extends TrustException {

	private static final long serialVersionUID = 1L;

	public ExternalIntegrationException(String msg, TrustError trustError) {
		super(msg, trustError);
	}

	public ExternalIntegrationException(String msg, TrustError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public ExternalIntegrationException(String msg, TrustError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public ExternalIntegrationException(String msg, TrustError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
