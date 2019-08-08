package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.TrustError;

/**
 * Exception that will occur in the control layer
 * @author rafael.goncalves
 */
public class TrustControllerException extends TrustException {

	private static final long serialVersionUID = 1L;

	public TrustControllerException(String msg, TrustError trustError) {
		super(msg, trustError);
	}

	public TrustControllerException(String msg, TrustError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public TrustControllerException(String msg, TrustError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public TrustControllerException(String msg, TrustError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
