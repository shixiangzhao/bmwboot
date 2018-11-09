package com.shixzh.spring.bmw.utils;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/8 11:33
 */
public class BmwBeanUtiles {

    public static <T> T generatorObject(Object source, Class<T> targetClass){
        if (source == null){
            return null;
        }
        T t = null;
        try {
            t = targetClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        BeanUtils.copyProperties(source, t);
        return t;
    }

    public static <S, T> List<T> generatorList(List<S> sourceList, Class<T> targetClass) {
        if (sourceList == null) {
            return null;
        }
        List<T> target = new ArrayList<T>();
        for (S s: sourceList){
            T t = generatorObject(s, targetClass);
            target.add(t);
        }
        return target;
    }
}