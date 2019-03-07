package com.hfview.DoThis;

/**
 * 内部类的创建和内部类返回外部类对象
 *
 * @author: zhw
 * @since: 2019/3/7 15:05
 */
public class Demo1 {

    public void f(){
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
        Inner inner = demo1.inner();//第一种创建方式，通过外部类的方法来返回

        //or Inner inner1=demo1.new Inner(); //第二种方式，这个就是 .new语法

        Demo1 demo11 = inner.outer();
        demo11.f();

        System.out.println(demo1==demo11);
    }
}
