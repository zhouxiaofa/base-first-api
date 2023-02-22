package indi.zxf.pro.base.first.api.security.impl;

import indi.zxf.pro.base.first.api.model.impl.User;
import indi.zxf.pro.base.first.api.security.Interceptor;
import indi.zxf.pro.base.first.api.security.util.JwtUtil;
import io.jsonwebtoken.Claims;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 默认处理拦截器实现
 *
 * @author zhouxiaofa
 * @date 2023/1/19 12:37
 **/
@Component
public class InterceptorImpl implements Interceptor {

    Logger logger = LoggerFactory.getLogger(InterceptorImpl.class);

    @Resource
    private UserManagerImpl userManager;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("preHandle...");
        String uri = request.getRequestURI();
        logger.info("当前请求地址" + uri);

        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        String token = request.getHeader("token");
        try {
            Claims claims = JwtUtil.parse(token);
            String userId = claims.get("userId", String.class);
            String userName = claims.get("userName", String.class);
            User user = new User();
            user.setCreateUserId(userId);
            user.setCreateUserName(userName);
            userManager.set(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("postHandle...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("afterCompletion...");
    }
}
