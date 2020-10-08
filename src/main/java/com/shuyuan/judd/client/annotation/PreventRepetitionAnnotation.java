package com.shuyuan.judd.client.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Sting
 * create 2017/05/05
 **/
@Retention(RetentionPolicy.RUNTIME) // 在运行时可以获取
@Target(value = {ElementType.METHOD, ElementType.TYPE})  // 作用到类，方法，接口上等
public @interface PreventRepetitionAnnotation {
    /**
     * 指定时间内不可重复提交,单位秒
     * <p>
     * 使用 请求打@AvoidRepeatableCommit(timeout = 50)  时间默认可设置
     *
     */
    long timeout() default 5;
}
