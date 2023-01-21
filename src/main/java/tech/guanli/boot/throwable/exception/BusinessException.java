package tech.guanli.boot.throwable.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * 错误编码，分类码1位+业务码2位+错误码3位
	 */
	protected Integer errorCode;

	public BusinessException() {
		super();
		errorCode = ErrorCodeConstant.BUSINESS;
	}

	public BusinessException(String message) {
		super(message);
		errorCode = ErrorCodeConstant.BUSINESS;
	}

	/**
	 * 
	 * @param message
	 * @param errorCode start with 1 length 6
	 */
	public BusinessException(String message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public BusinessException(Throwable throwable) {
		super(throwable);
	}
}
