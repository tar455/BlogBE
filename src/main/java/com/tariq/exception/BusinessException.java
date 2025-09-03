package com.tariq.exception;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessException extends Exception {
    private String code;
    private String message;
}
