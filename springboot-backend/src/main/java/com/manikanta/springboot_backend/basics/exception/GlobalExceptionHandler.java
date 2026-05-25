package com.manikanta.springboot_backend.basics.exception;

import com.manikanta.springboot_backend.basics.dto.ApiResponse;

import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiResponse<String>
    handleStudentNotFoundException(
            StudentNotFoundException ex)
    {
        return new ApiResponse<>(
                ex.getMessage(),
                404,
                null
        );
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(
            HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse<String>
    handleGeneralException(Exception ex)
    {
        return new ApiResponse<>(
                "Something went wrong",
                500,
                null
        );
    }


    @ExceptionHandler(
            MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse<String>
    handleValidationException(
            MethodArgumentNotValidException ex)
    {
        String errorMessage =
                ex.getBindingResult()
                        .getFieldError()
                        .getDefaultMessage();

        return new ApiResponse<>(
                errorMessage,
                400,
                null
        );
    }


}