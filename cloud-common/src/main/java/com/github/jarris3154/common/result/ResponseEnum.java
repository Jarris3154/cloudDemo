package com.github.jarris3154.common.result;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum ResponseEnum {
    SUCCESS(0, "成功"),
    ERROR(-1, "服务器内部错误");

    private Integer code;
    private String message;
}
