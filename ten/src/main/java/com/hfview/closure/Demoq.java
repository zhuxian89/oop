package com.hfview.closure;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/11 10:48
 */
interface Readable{

    void read();
}

class MyReadable{

    void read(){
        System.out.println("我自己特殊的read方法和接口Readable中的read意义不一样");
    }
}

/**
 * Demo已经继承了MyReadable，而且有自己的read方法，这个方法是有特殊意义的。
 * 这个时候就不能实现Readable，而直接实现该接口。
 * 这个时候，就可以采用Demoq的内部类来继承该接口
 *
 */
public class Demoq extends MyReadable{

    class inner implements Readable{

        @Override
        public void read() {
            System.out.println("Readable 接口特殊的read方法");
        }
    }

}
