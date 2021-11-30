package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError {

    //通用错误类型
    PARAMETER_VALIDATION_ERROR(10001,"parameter not valid"),
    UNKNOWN_ERROR(10002,"unknown error"),
    //10000开头为用户信息相关的错误定义
    USER_NOT_EXIST(20001,"user doesn't exist"),
    USER_LOGIN_FAIL(20002,"user's tel or password is not correct");
    ;

    private int errCode;
    private String errMsg;

    EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
