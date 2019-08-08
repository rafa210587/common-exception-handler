package comum.exception.handler.domain;


import java.io.Serializable;
import java.sql.Timestamp;

import com.google.gson.Gson;

import lombok.Data;

/**
 * Class that will return errors in the default
 * @author alan.franco
 */

@Data
public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Timestamp timestamp;
	private String errorDescription;
	private String message;
	private String path;
	
	
	public StandardError() {
	}

	public StandardError(Timestamp timestamp, String errorDescription, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.errorDescription = errorDescription;
		this.message = message;
		this.path = path;
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
