package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.TrustError;

/**
 * Exception that will occur in the service layer
 * 
 * @author alan.franco
 */
public class TrustServiceException extends TrustException {

	private static final long serialVersionUID = 1L;

	public TrustServiceException(String msg, TrustError trustError) {
		super(msg, trustError);
	}

	public TrustServiceException(String msg, TrustError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public TrustServiceException(String msg, TrustError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public TrustServiceException(String msg, TrustError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
