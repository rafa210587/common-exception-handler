package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.TrustError;

/**
 * Exception that will occur in data validation
 * 
 * @author rafael.goncalves
 */
public class TrustDataValidationException extends TrustException {

	private static final long serialVersionUID = 1L;

	public TrustDataValidationException(String msg, TrustError trustError) {
		super(msg, trustError);
	}

	public TrustDataValidationException(String msg, TrustError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public TrustDataValidationException(String msg, TrustError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public TrustDataValidationException(String msg, TrustError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}
}
