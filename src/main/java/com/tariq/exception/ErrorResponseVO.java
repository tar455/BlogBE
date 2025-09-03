package com.tariq.exception;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseVO {
    private String code;
    private String msg;
}
