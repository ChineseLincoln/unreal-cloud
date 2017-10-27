package org.unreal.cloud.common.constant

enum class ExceptionConstants constructor(var status: Int, var message:String){
    /**
     * Common Exception Const
     */
    EX_TOKEN_EXPIRE(10001, "Token 过期失效！"),
    EX_CLIENT_NOT_ALLOW(10002, "请求客户端不允许访问，请联系管理员！"),
    EX_UNKNOWN_ERROR(99999, "未标示错误，请系统联系管理员处理！"),

    /**
     * User Exception Const
     */
    EX_USER_NOT_FOUND(40001, "用户不存在!"),
    EX_USER_AUTH_FAIL(40002 ,"用户认证失败！"),
    EX_USER_PASSWORD_ENCODE(40003 , "用户密码加密失败！"),
    EX_USER_ACCOUNT_OR_PASSWORD_EMPTY(40004 , "账号密码不能为空！"),
    EX_USER_ACCOUNT_ALREADY_USED(40005 , "用户名已使用！"),

    EX_ROUTER_CLIENT_NOT_FOUND(30001, "路由信息未找到！"),
    EX_ROUTER_SECRET_NOT_MATCH(30002, "路由秘钥错误！"),
    EX_ROUTER_LOCKED(30003, "路由信息锁定！")
}
