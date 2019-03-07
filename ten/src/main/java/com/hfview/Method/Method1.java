package com.hfview.Method;

import com.hfview.Upcase.IDestination;

/**
 * 局部内部类：感觉这个东西就是辅助你解决的一个结构。
 * 而且是你不想被别人调用的。
 * 它和成员内部类主要区别就是，作用域更小
 *
 * @author: zhw
 * @since: 2019/3/7 16:17
 */
public class Method1 {

    public IDestination destination(){

        return new IDestination() {
            @Override
            public String readLabel() {
                return "destination";
            }
        };
    }

    public static void main(String[] args) {
        Method1 method1 = new Method1();
        IDestination destination = method1.destination();
        System.out.println(destination.readLabel());
    }

}
