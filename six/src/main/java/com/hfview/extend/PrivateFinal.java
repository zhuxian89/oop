package com.hfview.extend;

import org.junit.Test;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/5 10:28
 */
public class PrivateFinal {

    public static void main(String[] args) {

    }

    @Test
    public void test1(){
        PrivateFinalA b = new PrivateFinalB();
        //b.method1();
    }

}


class PrivateFinalA{

    private void method1(){
        System.out.println("PrivateFinalA of method1");
    }

}

class PrivateFinalB extends PrivateFinalA {

    public void method1(){
        System.out.println("PrivateFinalB of method1");
    }

}