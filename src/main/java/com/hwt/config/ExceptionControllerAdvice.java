package com.hwt.config;

import com.hwt.Exception.APIException;
import com.hwt.constant.ResultCode;
import com.hwt.vo.ResultVO;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 黄雯婷
 * @version 1.0
 * @description: 全局异常处理类
 * @date 2020-08-24 14:51:07
 **/
@RestControllerAdvice
public class ExceptionControllerAdvice {

    /**
     * 全局处理参数校验不通过异常
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        //从异常对象中拿到ObjectError对象
        ObjectError objectError=e.getBindingResult().getAllErrors().get(0);
        //然后提取错误提示信息进行返回
        return new ResultVO<>(ResultCode.VALIDATE_FAILED,objectError.getDefaultMessage());
    }

    /**
     * 全局处理自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e){
        return new ResultVO<>(ResultCode.FAILED,e.getMsg());
    }
}
