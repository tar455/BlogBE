package com.tariq.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponseVO> handleResourceNotFoundException(BusinessException ex) {
        return new ResponseEntity<>(new ErrorResponseVO(ex.getCode(),ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}
