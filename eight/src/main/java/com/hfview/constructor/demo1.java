package com.hfview.constructor;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Test;

public class demo1 {


    @Test
    public void method1(){
        B b = new B();
    }

}

class A{

    void draw(){
        System.out.println("A of draw()");
    }

    public A(){
        System.out.println("A constructor invoke:before draw");

        draw();

        System.out.println("A constructor invoke:after draw");
    }
}

class B extends A{

    private int count = 1;

    void draw(){
        System.out.println("B of draw()_count:"+count);
    }

    public B(){
        System.out.println("B constructor invoke");
    }

}