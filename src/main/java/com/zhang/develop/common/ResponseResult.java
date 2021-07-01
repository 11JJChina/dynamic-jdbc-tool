package com.zhang.develop.common;

import java.io.Serializable;

/**
 * @Author csurong
 * @Date: 2021/6/3
 */
public class ResponseResult<T> implements Serializable {

    private static final Integer CODE_SUCCESS = 10000;
    private static final Integer CODE_ERROR = 40000;
    private static final Integer CODE_SERVER_ERROR = 50000;

    private int code;
    private String message;
    private T data;
//    private String requestId;

    public ResponseResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
//        this.requestId = MDC.get(Contants.REQUEST_ID);
    }

    public static <T> ResponseResult createSuccessResponse(T data) {
        return new ResponseResult<>(CODE_SUCCESS, "success", data);
    }

    public static <T> ResponseResult createSuccessResponse() {
        return createSuccessResponse(null);
    }

    public static <T> ResponseResult createErrorResponse(String message) {
        return new ResponseResult<>(CODE_ERROR, message, null);
    }
    public static <T> ResponseResult createErrorResponse(T data) {
        return new ResponseResult<>(CODE_ERROR, "fail", data);
    }

    public static <T> ResponseResult createUnexceptionResponse(String message) {
        return new ResponseResult(CODE_SERVER_ERROR, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
