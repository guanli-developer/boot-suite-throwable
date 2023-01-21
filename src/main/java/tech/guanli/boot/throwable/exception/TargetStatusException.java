package tech.guanli.boot.throwable.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TargetStatusException extends BusinessException {
	private static final long serialVersionUID = 1L;

	public TargetStatusException() {
		super();
		errorCode = ErrorCodeConstant.TARGET_STATUS;
	}

	public TargetStatusException(String message) {
		super(message);
		errorCode = ErrorCodeConstant.TARGET_STATUS;
	}

	/**
	 * 
	 * @param message
	 * @param errorCode start with 5 length 6
	 */
	public TargetStatusException(String message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

}
