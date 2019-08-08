package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.TrustError;



/**
 * Exception that will occur in the business layer
 * @author rafael.goncalves
 */
public class TrustBusinessException extends TrustException {

	private static final long serialVersionUID = 1L;

	public TrustBusinessException(String msg, TrustError trustError) {
		super(msg, trustError);
	}

	public TrustBusinessException(String msg, TrustError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public TrustBusinessException(String msg, TrustError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public TrustBusinessException(String msg, TrustError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
