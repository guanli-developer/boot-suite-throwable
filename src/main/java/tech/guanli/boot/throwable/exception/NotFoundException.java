package tech.guanli.boot.throwable.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class NotFoundException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public NotFoundException() {
		super();
		errorCode = ErrorCodeConstant.NOT_FOUNT;
	}

	public NotFoundException(String message) {
		super(message);
		errorCode = ErrorCodeConstant.NOT_FOUNT;
	}

	/**
	 * 
	 * @param message
	 * @param errorCode start with 4 length 6
	 */
	public NotFoundException(String message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
}
