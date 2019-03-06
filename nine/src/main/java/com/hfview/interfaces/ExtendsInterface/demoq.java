package com.hfview.interfaces.ExtendsInterface;

/**
 *  组合接口的时候名字冲突。
 *  这个很好理解，就按照方法重载理解就好了
 *
 * @author: zhw
 * @since: 2019/3/6 16:01
 */
public class demoq {


}

interface I1{
    void f();
}

interface I2{
    int f(int i);
}

interface I3{
    int f();
}

class C{
    public int f(){
        return 1;
    }
}

/**
 * 这个没问题，因为相当于方法重载
 */
class C2 implements I1,I2{

    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 0;
    }
}

/**
 * 这个没问题，因为相当于方法重载
 */
class C3 extends C implements I2{

    @Override
    public int f(int i) {
        return 0;
    }
}

/***
 * 这个没问题，C就相当于I3的实现了
 */
class C4 extends C implements I3{

}

/*
直接报错了，因为这种方法重载的时候不能根据返回值来区分
class C5 extends C implements I1{

}*/

/*
直接报错了，因为这种方法重载的时候不能根据返回值来区分
class C6 implements I1,I3{

    @Override
    public void f() {

    }
}*/
