package org.unreal.cloud.common.vo

class BaseResponse<T> {
    var status = 200
    var data = "" as T

    constructor()

    private constructor(data: T) {
        this.data = data
    }

    companion object {
        fun <T> ok(data: T): BaseResponse<T> {
            return BaseResponse(data)
        }

        fun ok(): BaseResponse<String> {
            return BaseResponse()
        }
    }
}
