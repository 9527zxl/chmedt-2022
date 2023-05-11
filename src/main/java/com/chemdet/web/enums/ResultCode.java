package com.chemdet.web.enums;

public enum ResultCode {
    SUCCESS(200, "成功"),
    ERROR(500, "服务器错误");
    // ... 其他状态码

    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    }
