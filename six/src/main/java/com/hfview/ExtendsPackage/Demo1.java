package com.hfview.ExtendsPackage;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo1 {

    public static void main(String[] args) {

        B b = new B();

        b.method();
    }

}

@Slf4j
class A{

    public A(){

    }

    protected int count = 10;

    @Override
    public String toString() {
        return "A_"+count;
    }
}

@Slf4j
class B extends A{

    private int m  = 20;

    public B(){
        super();
    }

    public void method(){
        log.debug("super.getClass():"+super.getClass());
        log.debug("this.getClass():"+this.getClass());
        log.debug("super.getClass()==this.getClass():"+(this.getClass()==super.getClass()));
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "B_"+m;
    }
}