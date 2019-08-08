package com.trust.comum.exception.handler.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * Class that will store the field name and description. 
 * @author alan.franco
 */
@Data
public class FieldMessage implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String message;
	
	public FieldMessage() {
	}
	
	public FieldMessage(String fieldName, String message) {
		super();
		this.fieldName = fieldName;
		this.message = message;
	}
	

}
