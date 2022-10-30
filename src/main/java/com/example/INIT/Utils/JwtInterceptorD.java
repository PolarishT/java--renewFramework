package com.example.INIT.Utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


/*
 * @Author zzt
 */

/**
 * 这里为了简化 使用的自定义的mysql层
 */

@Component
@Slf4j
public class JwtInterceptorD implements HandlerInterceptor {
//    @Autowired
//    private Userservice userservice;

//    @Override
//    public boolean preHandle(HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) {
//        String token = request.getHeader("token");
//        if (!(handler instanceof HandlerMethod)) {
//            return true;
//        }
//        // 执行认证
//        if (StrUtil.isBlank(token)) {
//            throw new BusinessException(ErrorCode.FORBIDDEN, "无token，请重新登录");
//        }
//        // 获取 token 中的username
//        String username;
////        User user;
//        try {
//            username = JWT.decode(token).getAudience().get(0);
//            // 根据token中的userid查询数据库
//        } catch (Exception e) {
//            String errMsg = "token验证失败，请重新登录";
//            log.error(errMsg + ", token=" + token, e);
//            throw new BusinessException(ErrorCode.SYSTEM_ERROR, errMsg);
//        }
//
//        tcu = tcuMapper.Find(username);
//        if (tcu == null) {
//            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "用户不存在，请重新登录");
//        }
//        try {
//            // 用户密码加签验证 token
//            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(tcu.getPassword())).build();
//            jwtVerifier.verify(token);
//        } catch (JWTVerificationException e) {
//            throw new BusinessException(ErrorCode.AUTH_ERROR, "token验证失败，请重新登录");
//        }
//        return true;
//    }
}

