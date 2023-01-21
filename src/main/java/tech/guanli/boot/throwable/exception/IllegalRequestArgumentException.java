package tech.guanli.boot.throwable.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class IllegalRequestArgumentException extends BusinessException {
	private static final long serialVersionUID = 1L;

	public IllegalRequestArgumentException() {
		super();
		errorCode = ErrorCodeConstant.ILLEGAL_REQUEST_ARGUMENT;
	}

	public IllegalRequestArgumentException(String message) {
		super(message);
		errorCode = ErrorCodeConstant.ILLEGAL_REQUEST_ARGUMENT;
	}

	/**
	 * 
	 * @param message
	 * @param errorCode start with 2 length 6
	 */
	public IllegalRequestArgumentException(String message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

}
