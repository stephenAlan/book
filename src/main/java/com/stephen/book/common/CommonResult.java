package com.stephen.book.common;

/**
 * Created by ssc on 2020-09-02 17:33 .
 * Description:
 */
public class CommonResult<T> {

    private int code;
    private String msg;
    private T data;

    private CommonResult() {}

    private CommonResult(int code,String msg,T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> CommonResult<T> success() {
        return success(null);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg(),data);
    }

    public static <T> CommonResult<T> failed(T data) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMsg(),data);
    }

    public static <T> CommonResult<T> failed(ResultCode resultCode) {
        return failed(null);
    }
    public static <T> CommonResult<T> failed(ResultCode resultCode, T data) {
        return new CommonResult<T>(resultCode.getCode(),resultCode.getMsg(),data);
    }


}
