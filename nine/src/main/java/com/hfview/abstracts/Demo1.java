package com.hfview.abstracts;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 10:19
 */
public class Demo1 extends AbstractBase {

    public Demo1(){
        System.out.println("demo1 constructor invoke");
    }

    @Override
    public void test2() {

    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
    }


}
