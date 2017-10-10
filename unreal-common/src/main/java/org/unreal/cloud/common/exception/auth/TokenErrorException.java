package org.unreal.cloud.common.exception.auth;

import org.unreal.cloud.common.constant.ExceptionConstants;
import org.unreal.cloud.common.exception.BaseException;

public class TokenErrorException extends BaseException {

    public TokenErrorException() {
        super(ExceptionConstants.EX_TOKEN_ERROR);
    }
}
