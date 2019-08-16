package comum.exception.handler.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.google.gson.Gson;

/**
 * Class that will return errors in the default
 * @author rafael.goncalves
 */
public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Timestamp timestamp;
	private String errorDescription;
	private String message;	
	
	public StandardError() {
	}

	public StandardError(Timestamp timestamp, String errorDescription, String message) {
		super();
		this.timestamp = timestamp;
		this.errorDescription = errorDescription;
		this.message = message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
/*	public Integer getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}*/
	
	public String getErrorDescription() {
		return errorDescription;
	}
	
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public static StandardError getStandardError(String erro) {
		StandardError standardError = new StandardError();
		if(erro != null) {
			Gson g = new Gson(); 
			standardError  = g.fromJson(erro, StandardError.class);
		}
		return standardError;
	}

}
