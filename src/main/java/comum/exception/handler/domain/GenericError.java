package comum.exception.handler.domain;

/**
 * Interface that will have to be implemented to define the code and description of the error
 * @author rafael.goncalves
 */

public interface GenericError {

	String getErrorDescription();

	void setErrorDescription(String errorDescription);

}
