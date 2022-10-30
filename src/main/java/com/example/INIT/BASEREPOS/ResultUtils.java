package com.example.INIT.BASEREPOS;

/**
 * 返回工具类
 *
 * @author zzt
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @Description {com.example.INIT.BASEREPOS.ErrorCode.java}
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @Description {com.example.INIT.BASEREPOS.ErrorCode.java}
     */
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     */
    public static BaseResponse error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
