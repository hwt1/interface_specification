package com.hwt.constant;

import lombok.Getter;

/**
 * @author 黄雯婷
 * @version 1.0
 * @description: 响应码枚举
 * @date 2020-08-24 15:43:07
 **/
@Getter
public enum ResultCode {
    SUCCESS(1000,"操作成功"),
    FAILED(1001,"响应失败"),
    VALIDATE_FAILED(1002,"参数校验失败");
    private int code;
    private String msg;
    ResultCode(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
