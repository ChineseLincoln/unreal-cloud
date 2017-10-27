package org.unreal.cloud.router.exception

import org.unreal.cloud.common.constant.ExceptionConstants
import org.unreal.cloud.common.exception.BaseException

class RouterClientNotFound : BaseException(ExceptionConstants.EX_ROUTER_CLIENT_NOT_FOUND)
class RouterSecretError : BaseException(ExceptionConstants.EX_ROUTER_CLIENT_NOT_FOUND)
class RouterClientLocked : BaseException(ExceptionConstants.EX_ROUTER_LOCKED)