package com.manikanta.springboot_backend.basics.exception;

import com.manikanta.springboot_backend.basics.dto.ApiResponse;
import com.manikanta.springboot_backend.basics.dto.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse
    handleStudentNotFoundException(
            StudentNotFoundException ex,
            HttpServletRequest request)
    {
        return new ErrorResponse(
                LocalDateTime.now(),
                404,
                "NOT_FOUND",
                ex.getMessage(),
                request.getRequestURI()
        );
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(
            HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse
    handleGeneralException(
            Exception ex,
            HttpServletRequest request)
    {
        return new ErrorResponse(
                LocalDateTime.now(),
                500,
                "INTERNAL_SERVER_ERROR",
                "Something went wrong",
                request.getRequestURI()
        );
    }


    @ExceptionHandler(
            MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse
    handleValidationException(
            MethodArgumentNotValidException ex,
            HttpServletRequest request)
    {
        String message =
                ex.getBindingResult()
                        .getFieldError()
                        .getDefaultMessage();

        return new ErrorResponse(
                LocalDateTime.now(),
                400,
                "BAD_REQUEST",
                message,
                request.getRequestURI()
        );
    }


}