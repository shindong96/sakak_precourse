package com.sakak.precourse.presentation;

import com.sakak.precourse.dto.response.ErrorResponse;
import com.sakak.precourse.exception.NutritionNotFoundException;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleInvalidRequest(final BindingResult bindingResult) {
        final List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        final FieldError mainError = fieldErrors.get(0);

        return ResponseEntity.badRequest().body(new ErrorResponse(mainError.getDefaultMessage()));
    }

    @ExceptionHandler(NutritionNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgumentException(final NutritionNotFoundException e) {
        return ResponseEntity.status(404).body(new ErrorResponse(e.getMessage()));
    }
}