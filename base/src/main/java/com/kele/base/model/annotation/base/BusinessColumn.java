package com.kele.base.model.annotation.base;

import com.kele.base.model.enumerate.base.ColumnType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 基础的列信息
 *
 * @author dzy
 * @date 2020-01-20 13:45:54
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BusinessColumn {

    //列名
    String value() default "";

    //字段名
    String columnName() default "";

    //字段类型
    ColumnType type() default ColumnType.INPUT;

    //是否是下拉选
    String selectCode() default "";

    //是否多选  默认单选
    boolean multiple() default false;
}
