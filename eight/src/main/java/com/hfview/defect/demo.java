package com.hfview.defect;

import org.junit.Test;

public class demo {

    @Test
    public void test(){

        A b= new B();
        System.out.println(b.count);

        b.getCount();

        /**
         * output:
         * 10
         * B of this.count:20
         * B of super.count:10
         *
         */
    }

}

class A{

    public int count = 10;

    public void getCount(){
        System.out.println("A of count:"+count);
    }

}

class B extends A{

    public int count =20;

    public void getCount(){
        System.out.println("B of this.count:"+this.count);

        System.out.println("B of super.count:"+super.count);
    }

}