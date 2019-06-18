package com.zpself.module.basic.exception;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zengpeng
 * @date 2019/6/18
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler({ Exception.class })
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public String handException(HttpServletRequest request , Exception e) throws Exception {
        e.printStackTrace();
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
            throw e;
        }
        return e.getMessage();
    }

}
