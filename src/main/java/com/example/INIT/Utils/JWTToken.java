package com.example.INIT.Utils;


import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author Lenovo
 */
@Slf4j
public class JWTToken {
    public static String createToken(String username, String signature) {
        return JWT.create().withAudience(username).withExpiresAt(DateUtil.offsetHour(new Date(), 12))
                .sign(Algorithm.HMAC256(signature));
    }

}




