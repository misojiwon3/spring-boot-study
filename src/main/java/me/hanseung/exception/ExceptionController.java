package me.hanseung.exception;

import me.hanseung.exception.ErrorResponse;
import me.hanseung.exception.SampleException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(SampleException.class)
    public ResponseEntity<ErrorResponse> sampleException(SampleException e) {
        ErrorResponse er = new ErrorResponse("message", "101");
        return new ResponseEntity<ErrorResponse>(er, HttpStatus.BAD_REQUEST);
    }
}
