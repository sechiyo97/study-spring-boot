package org.example.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
// @interface : 이 파일을 어노테이션 클래스로 지정 (LoginUser이라는 어노테이션 생성)
public @interface LoginUser {
}
