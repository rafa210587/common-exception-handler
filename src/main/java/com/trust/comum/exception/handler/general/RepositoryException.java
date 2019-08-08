package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in the repository layer
 * 
 * @author rafael.goncalves
 */
public class RepositoryException extends Exception {

	private static final long serialVersionUID = 1L;

	public RepositoryException(String msg, GenericError trustError) {
		super(msg, trustError);
	}

	public RepositoryException(String msg, GenericError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public RepositoryException(String msg, GenericError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public RepositoryException(String msg, GenericError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}

}
