package com.mysite.knitly.global.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponse {
    private final ErrorBody error;

    @Getter
    @Builder
    public static class ErrorBody{
        private final String code;
        private final String status;
        private final String message;
    }

    public static ErrorResponse errorResponse(ErrorCode errorCode) {
        return ErrorResponse.builder()
                .error(ErrorBody.builder()
                        .code(errorCode.getCode())
                        .status(errorCode.getStatus().name())
                        .message(errorCode.getMessage())
                        .build())
                .build();
    }
}
