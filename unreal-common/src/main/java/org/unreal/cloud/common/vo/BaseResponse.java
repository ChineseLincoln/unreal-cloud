package org.unreal.cloud.common.vo;

public class BaseResponse<T> {

    private int status = 200;

    private T data;

    public BaseResponse(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }
}
