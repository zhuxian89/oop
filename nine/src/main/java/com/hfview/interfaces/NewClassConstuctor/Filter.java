package com.hfview.interfaces.NewClassConstuctor;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 11:47
 */
public class Filter {

    public void name(){
        System.out.println(getClass().getName());
    }

    public Object process(Object input){
        return  input;
    }

}
