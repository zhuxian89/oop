package com.hfview.anonymous;

import com.hfview.Upcase.IContents;

/**
 * 匿名内部类，调用有参构造器(基类是类或者抽象类)
 * @author: zhw
 * @since: 2019/3/7 16:39
 */
public class Parce8 {

    public A a(int i){
        return new A(i){

        };
    }

    public B b(int i){
        final int count =10;//这里必须声明为final(因为它会被内部类直接使用,这里有篇博客有详细的解释
        //主要原因是防止内部类和外部类数据不一致才设置成final的。

        return new B(i){//然后I却不需要声明为final(因为它不会被内部类直接使用,而是传递给了基类)
            int myCount = count;
        };
    }

    private class A{
        int i;
        public A(int i){
            this.i = i;
        }

        public void show(){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Parce8 parce7 = new Parce8();
        A a = parce7.a(10);
        a.show();
    }
}

abstract class B{

    int i;
    public B(int i){
        this.i = i;
    }

    public void show(){
        System.out.println(i);
    }

}
