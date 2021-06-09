package com.github.jarris3154.common.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class ApiResult {

    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    private ApiResult(){ }

    public static ApiResult ok(){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(ResponseEnum.SUCCESS.getCode());
        apiResult.setMessage(ResponseEnum.SUCCESS.getMessage());
        return apiResult;
    }

    public static ApiResult error(){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(ResponseEnum.ERROR.getCode());
        apiResult.setMessage(ResponseEnum.ERROR.getMessage());
        return apiResult;
    }

    public static ApiResult setResult(ResponseEnum responseEnum){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(responseEnum.getCode());
        apiResult.setMessage(responseEnum.getMessage());
        return apiResult;
    }

    public ApiResult data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public ApiResult data(Map<String, Object> map){
        this.data = map;
        return this;
    }

    public ApiResult message(String message){
        this.setMessage(message);
        return this;
    }

    public ApiResult code(Integer code){
        this.setCode(code);
        return this;
    }
}
