package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Type { //annotation에 쓸 속성명 name(), 속성값 value()을 설정했다.
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface Field {
	int value();
}

@Retention(RetentionPolicy.RUNTIME) //객체 생성 후에도 존재하는 annotation.
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0; //기본값 선언 가능.
}

@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE) // annotation에 쓰는 annotation, 38번째 줄처럼.
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD}) // target이 2개인경우 {} 필요.
@interface Universal {
	
}