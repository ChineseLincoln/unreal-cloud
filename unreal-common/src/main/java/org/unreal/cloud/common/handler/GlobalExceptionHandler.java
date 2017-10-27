package org.unreal.cloud.common.handler;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.unreal.cloud.common.exception.BaseException;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BaseException.class)
    public String baseExceptionHandler(HttpServletResponse response, BaseException ex) {
        return makeErrorJson(ex);
    }

    @ExceptionHandler(RuntimeException.class)
    public String exceptionHandler(HttpServletResponse response, Exception ex) {
        return makeErrorJson(ex);
    }

    private String makeErrorJson(Exception ex) {
        ex.printStackTrace();
        Map<String, Object> result = new HashMap<>();
        if (BaseException.class.isAssignableFrom(ex.getClass())) {
            BaseException baseException = (BaseException) ex;
            result.put("status", baseException.getStatus());
            result.put("message", baseException.getMessage());
        } else {
            result.put("status", 9999);
            result.put("message", ex.getMessage());
        }
        return new Gson().toJson(result);
    }


}
