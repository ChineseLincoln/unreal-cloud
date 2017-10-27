package org.unreal.cloud.common.exception.auth

import org.unreal.cloud.common.constant.ExceptionConstants
import org.unreal.cloud.common.exception.BaseException

class TokenExpireException : BaseException(ExceptionConstants.EX_TOKEN_EXPIRE)
class ClientNotAllowException : BaseException(ExceptionConstants.EX_CLIENT_NOT_ALLOW)
