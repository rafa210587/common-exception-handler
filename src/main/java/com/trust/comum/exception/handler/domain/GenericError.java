package com.trust.comum.exception.handler.domain;

/**
 * Interface that will have to be implemented to define the code and description of the error
 * @author alan.franco
 */
public interface GenericError {

	String getErrorDescription();

	void setErrorDescription(String errorDescription);

}
