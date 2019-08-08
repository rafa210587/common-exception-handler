package com.trust.comum.exception.handler.general;

import org.springframework.http.HttpStatus;

import com.trust.comum.exception.handler.domain.TrustError;

/**
 * Default class that will handle errors in exceptions
 * 
 * @author rafael.goncalves
 */
public class TrustException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	TrustError trustError;
	HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

	public TrustException(String msg, TrustError trustError) {
		super(msg);

	}

	public TrustException(String msg, TrustError trustError, Throwable cause) {
		super(msg, cause);

	}

	public TrustException(String msg, TrustError trustError, HttpStatus httpStatus) {
		super(msg);

		this.httpStatus = httpStatus;
	}

	public TrustException(String msg, TrustError trustError, HttpStatus httpStatus, Throwable cause) {
		super(msg, cause);

		this.httpStatus = httpStatus;
	}

	public TrustError getTrustError() {
		return trustError;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
