package org.unreal.cloud.common.exception;

import org.unreal.cloud.common.constant.ExceptionConstants;

public class BaseException extends RuntimeException {

    private int status;

    public BaseException(ExceptionConstants constants) {
        super(constants.getMessage());
        this.status = constants.getStatusCode();
    }

    public BaseException(){
        super(ExceptionConstants.EX_UNKNOWN_ERROR.getMessage());
        this.status = ExceptionConstants.EX_UNKNOWN_ERROR.getStatusCode();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
