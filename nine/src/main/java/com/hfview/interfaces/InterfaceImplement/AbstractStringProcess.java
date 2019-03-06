package com.hfview.interfaces.InterfaceImplement;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 10:51
 */
public abstract class AbstractStringProcess implements Process{

    public void name(){
        System.out.println(getClass().getSimpleName());
    }

    public abstract String process(Object input);


}
