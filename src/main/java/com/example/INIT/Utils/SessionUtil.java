package com.example.INIT.Utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * Session 常用工具类
 *
 * @author zzt
 */
public class SessionUtil {

    /**
     * 获取request
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }

    /**
     * 获取session
     */
    public static HttpSession getSession() {
        return Objects.requireNonNull(getRequest()).getSession(false);
    }

    /**
     * 获取真实路径
     */
    public static String GetRealRootPath() {
        return Objects.requireNonNull(getRequest()).getServletContext().getRealPath("/");
    }

    /**
     * 获取ip
     */
    public static String getIp() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        if (servletRequestAttributes != null) {
            HttpServletRequest request = servletRequestAttributes.getRequest();
            return request.getRemoteAddr();
        }
        return null;
    }

    /**
     * 获取session中的Attribute
     */
    public static Object GetSessionAttribute(String name) {
        HttpServletRequest request = getRequest();
        return request == null ? null : request.getSession().getAttribute(name);
    }

    /**
     * 设置session的Attribute
     */
    public static void SetSessionAttribute(String name, Object value) {
        HttpServletRequest request = getRequest();
        if (request != null) {
            request.getSession().setAttribute(name, value);
        }
    }

    /**
     * 获取request中的Attribute
     */
    public static Object GetRequestAttribute(String name) {
        HttpServletRequest request = getRequest();
        return request == null ? null : request.getAttribute(name);
    }

    /**
     * 设置request的Attribute
     */
    public static void SetRequestAttribute(String name, Object value) {
        HttpServletRequest request = getRequest();
        if (request != null) {
            request.setAttribute(name, value);
        }
    }

    /**
     * 获取上下文path
     */
    public static String GetContextPath() {
        return Objects.requireNonNull(getRequest()).getContextPath();
    }

    /**
     * 删除session中的Attribute
     */
    public static void RemoveSessionAttribute(String name) {
        Objects.requireNonNull(getRequest()).getSession().removeAttribute(name);
    }

}