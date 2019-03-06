package com.hfview.interfaces.ClassImplement;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 11:27
 */
public class Process {

    public void name(){
        System.out.println(getClass().getName());
    }

    public Object process(Object input){
      return  input;
    }

}
