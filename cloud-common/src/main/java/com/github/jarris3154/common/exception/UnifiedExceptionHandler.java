package com.github.jarris3154.common.exception;

import com.github.jarris3154.common.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class UnifiedExceptionHandler {

    @ExceptionHandler(value= Exception.class)
    public ApiResult handleException(Exception e){
        log.error(e.getMessage(), e);
        return ApiResult.error();
    }

    @ExceptionHandler(value= BusinessException.class)
    public ApiResult handleException(BusinessException e){
        log.error(e.getMessage(), e);
        return ApiResult.error().message(e.getMessage()).code(e.getCode());
    }
}
