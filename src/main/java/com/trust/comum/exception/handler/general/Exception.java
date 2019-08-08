package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.GenericError;

/**
 * Default class that will handle errors in exceptions
 * 
 * @author rafael.goncalves
 */
public class Exception extends RuntimeException {

	private static final long serialVersionUID = 1L;

	GenericError trustError;
	HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

	public Exception(String msg, GenericError trustError) {
		super(msg);

	}

	public Exception(String msg, GenericError trustError, Throwable cause) {
		super(msg, cause);

	}

	public Exception(String msg, GenericError trustError, HttpStatus httpStatus) {
		super(msg);

		this.httpStatus = httpStatus;
	}

	public Exception(String msg, GenericError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, cause);

		this.httpStatus = httpStatus;
	}

	public GenericError getTrustError() {
		return trustError;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
