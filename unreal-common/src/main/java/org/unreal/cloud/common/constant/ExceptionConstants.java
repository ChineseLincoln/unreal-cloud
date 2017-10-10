package org.unreal.cloud.common.constant;

public enum ExceptionConstants {

    EX_TOKEN_ERROR(40001,"Token 失效"),
    EX_UNKNOWN_ERROR(99999,"未标示错误，请系统联系管理员处理！");

    private Integer statusCode;

    private String message;

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    ExceptionConstants(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
