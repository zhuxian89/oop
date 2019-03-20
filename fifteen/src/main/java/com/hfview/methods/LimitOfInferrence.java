package com.hfview.methods;

import java.util.HashMap;
import java.util.Map;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/19 10:57
 */
public class LimitOfInferrence {

    static void f(Map<LimitOfInferrence,GenericMethods> map){

    }

    <K,V> void f2(Map<K,V> map){

    }

    public static void main(String[] args) {
            //f(New.map());
        LimitOfInferrence limitOfInferrence = new LimitOfInferrence();

        /***
         * 显示的指明泛型类型
         */
        limitOfInferrence.<String,Integer>f2(new HashMap<>());

        LimitOfInferrence.<String,Integer>f(new HashMap<>());

    }



}
