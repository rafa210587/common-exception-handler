package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.GenericError;

/**
 * Exception that will occur in data validation
 * 
 * @author rafael.goncalves
 */
public class DataValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	public DataValidationException(String msg, GenericError trustError) {
		super(msg, trustError);
	}

	public DataValidationException(String msg, GenericError trustError, Throwable cause) {
		super(msg, trustError, cause);
	}

	public DataValidationException(String msg, GenericError trustError, HttpStatus httpStatus) {
		super(msg, trustError, httpStatus);
	}

	public DataValidationException(String msg, GenericError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustError, httpStatus, cause);
	}
}
