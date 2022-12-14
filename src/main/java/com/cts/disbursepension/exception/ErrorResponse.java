package com.cts.disbursepension.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;

/**
 * This class is used by global exception handler to send error response
 * 
 *  @author Ujjwal Sinha
 *  @author 857152
 *
 */
@Getter
public class ErrorResponse {
	private LocalDateTime timestamp;
	private String message;
	
	/**
	 * Used only for input validation errors
	 */
	@JsonInclude(Include.NON_NULL)
	private List<String> fieldErrors;
	
	public ErrorResponse(String message) {
		this.timestamp = LocalDateTime.now();
		this.message = message;
	}

	public ErrorResponse(String message, List<String> fieldErrors) {
		this.timestamp = LocalDateTime.now();
		this.message = message;
		this.fieldErrors = fieldErrors;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<String> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
	
}
