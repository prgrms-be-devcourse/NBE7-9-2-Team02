package com.mysite.knitly.global.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    // Common 0
    BAD_REQUEST("001", HttpStatus.BAD_REQUEST, "잘못된 요청입니다."), // 에시, 삭제가능

    // User 1000
    USER_NOT_FOUND("1001", HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다."),

    // Product 2000
    PRODUCT_NOT_FOUND("2001", HttpStatus.NOT_FOUND, "상품을 찾을 수 없습니다."),
    LIKE_ALREADY_EXISTS("2401", HttpStatus.CONFLICT, "이미 찜한 상품입니다."),
    LIKE_NOT_FOUND("2402", HttpStatus.NOT_FOUND, "삭제할 찜을 찾을 수 없습니다."),

    // Order 3000

    // Post 4000

    // Comment 4000

    // Review 5000

    // Event 6000

    // Image 7000

    // File 7000

    // System 9000
    ;

    private final String code;
    private final HttpStatus status;
    private final String message;

    ErrorCode(String code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }
}
