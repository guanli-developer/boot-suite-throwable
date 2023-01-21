package tech.guanli.boot.throwable.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * 
 * @author guan
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AuthenticationException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public AuthenticationException() {
		super();
		errorCode = ErrorCodeConstant.AUTHENTICATION;
	}

	public AuthenticationException(String message) {
		super(message);
		errorCode = ErrorCodeConstant.AUTHENTICATION;
	}

	/**
	 * 
	 * @param message
	 * @param errorCode start with 3 length 6
	 */
	public AuthenticationException(String message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

}
