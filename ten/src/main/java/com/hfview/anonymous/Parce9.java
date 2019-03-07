package com.hfview.anonymous;

/**
 * 匿名内部类，初始化(不是继承，而是实现接口的情况，接口中没有构造方法，所以不能初始化)
 * @author: zhw
 * @since: 2019/3/7 16:39
 */
public class Parce9 {

    /**
     * 这里切记 变量a的名字不能和count一样，否则赋值不了，这个待研究
     * @param a
     * @param b
     * @return
     */
    public IA ia(final int a,final int b){
        return new IA(){

            int count,price;

            {
                this.count = a;
                this.price = b;
            }

            @Override
            public void show() {
                System.out.println("count:"+count+",price:"+price);
            }
        };
    }

    public B b(){
        return new B(10){

        };
    }

    private interface IA{

        void show();

    }

    public static void main(String[] args) {
        Parce9 parce9 = new Parce9();
        IA ia = parce9.ia(10,20);
        ia.show();
    }
}


