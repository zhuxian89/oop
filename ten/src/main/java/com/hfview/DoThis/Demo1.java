package com.hfview.DoThis;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/7 15:05
 */
public class Demo1 {

    public void f(){
        System.out.println(Demo1.this.toString());
        System.out.println(Demo1.super.toString());
        System.out.println("outer f()");
    }

    class Inner{

        public Demo1 outer(){
            return Demo1.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        Inner inner = demo1.inner();

        //or Inner inner1=demo1.new Inner(); 这个就是 .new语法

        Demo1 demo11 = inner.outer();
        demo11.f();




    }
}
