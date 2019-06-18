package com.zpself.module.basic.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author zengpeng
 * @date 2019/6/18
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class HttpStatusException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public HttpStatusException() {
    }

    public HttpStatusException(String message) {
        super(message);
    }

    public HttpStatusException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpStatusException(Throwable cause) {
        super(cause);
    }

    public HttpStatusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
