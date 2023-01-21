package tech.guanli.boot.throwable.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class OuterServiceException extends BusinessException {
	private static final long serialVersionUID = 1L;

	public OuterServiceException(Throwable throwable) {
		super(throwable);
	}

	public OuterServiceException() {
		super();
		errorCode = ErrorCodeConstant.ILLEGAL_REQUEST_ARGUMENT;
	}

	public OuterServiceException(String message) {
		super(message);
		errorCode = ErrorCodeConstant.ILLEGAL_REQUEST_ARGUMENT;
	}

	public OuterServiceException(String message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
}
