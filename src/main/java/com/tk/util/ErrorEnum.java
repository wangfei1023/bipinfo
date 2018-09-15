package com.tk.util;


/**
 * @author 
 */
public enum ErrorEnum {

    ERROR_10000("10000", "查询开始日期不能为空"),
	ERROR_10001("10001", "查询结束日期必须大于查询开始日期");
    


    private String errorCode;
    private String errorMsg;


    ErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


}
