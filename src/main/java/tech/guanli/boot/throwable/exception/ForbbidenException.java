package tech.guanli.boot.throwable.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ForbbidenException extends BusinessException {
	private static final long serialVersionUID = 1L;

	public ForbbidenException() {
		super();
		errorCode = ErrorCodeConstant.FORBBIDEN;
	}

	public ForbbidenException(String message) {
		super(message);
		errorCode = ErrorCodeConstant.FORBBIDEN;
	}

	/**
	 * 
	 * @param message
	 * @param errorCode start with 6 length 6
	 */
	public ForbbidenException(String message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
}
