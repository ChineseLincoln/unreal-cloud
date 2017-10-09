package org.unreal.cloud.common.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.unreal.cloud.common.constant.ExceptionConstants;
import org.unreal.cloud.common.exception.BaseException;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice("org.unreal.cloud")
@ResponseBody
public class GlobalExceptionHandler {
    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<String> baseExceptionHandler(HttpServletResponse response , BaseException ex){
        return ResponseEntity.status(ex.getStatus()).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(HttpServletResponse response , Exception ex){
        logger.error("接口请求错误",ex);
        return ResponseEntity.status(ExceptionConstants.EX_UNKNOWN_ERROR.getStatusCode()).body(ExceptionConstants.EX_UNKNOWN_ERROR.getMessage());
    }
}
