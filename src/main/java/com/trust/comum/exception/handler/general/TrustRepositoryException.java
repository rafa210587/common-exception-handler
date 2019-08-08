package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.TrustError;

/**
 * Exception that will occur in the repository layer
 * 
 * @author rafael.goncalves
 */
public class TrustRepositoryException extends TrustException {

	private static final long serialVersionUID = 1L;

	public TrustRepositoryException(String msg, TrustError trustError) {
		super(msg, trustError);
	}

	public TrustRepositoryException(String msg, TrustError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public TrustRepositoryException(String msg, TrustError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public TrustRepositoryException(String msg, TrustError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
