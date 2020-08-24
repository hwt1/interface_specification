package com.hwt.Exception;

import lombok.Getter;

/**
 * @author 黄雯婷
 * @version 1.0
 * @description: 自定义异常
 * @date 2020-08-24 15:04:28
 **/
@Getter
public class APIException extends RuntimeException{
    private int code;
    private String msg;
    public APIException(){
        this(1001,"接口错误");
    }
    public APIException(String msg){
        this(1001,msg);
    }
    public APIException(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
