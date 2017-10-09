package org.unreal.cloud.test;

import org.junit.Test;
import org.unreal.cloud.jwt.JwtTokenUtils;
import org.unreal.cloud.jwt.TokenInfo;

import static org.junit.Assert.*;

public class JwtTestCase {

    @Test
    public void testGenToken(){
        TokenInfo tokenInfo = new TokenInfo("1", "lincoln", "admin", "林肯");
        System.out.println("tokenInfo = " + tokenInfo);
        String token = JwtTokenUtils.INSTANCE.getToken(tokenInfo);
        assertNotNull(token);
        TokenInfo tokenInfoResult = JwtTokenUtils.INSTANCE.parseToken(token);
        System.out.println("tokenInfoResult = " + tokenInfoResult);
    }

}
