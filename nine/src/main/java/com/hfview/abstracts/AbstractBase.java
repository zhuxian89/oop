package com.hfview.abstracts;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 10:17
 */
public abstract class AbstractBase {

    private int count=10;

    public AbstractBase(){
        System.out.println("abstract class constructor invoke_count:"+count);
    }

    public void test1(){

    }

    public abstract void test2();

}
