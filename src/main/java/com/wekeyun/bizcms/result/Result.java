package com.wekeyun.bizcms.result;

public class Result {
    /**
     * TODO
     * 这里code应该是 枚举值
     */
    private String code;
    private String message;

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
