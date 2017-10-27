package org.unreal.cloud.common.exception;

import org.unreal.cloud.common.constant.ExceptionConstants;

public class BaseException extends RuntimeException {

    private int status;

    public BaseException(ExceptionConstants constants) {
        super(constants.getMessage());
        this.status = constants.getStatus();
    }

    public int getStatus() {
        return status;
    }

}
