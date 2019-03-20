package com.hfview.ErasedType;

/**
 * 泛型擦除到object后不能调用特殊方法
 *
 * @author: zhw
 * @since: 2019/3/19 14:58
 */
public class Manipulator<T extends HasF> {

    private T obj;

    public Manipulator(T obj){
        this.obj = obj;
    }

    public void test(){
        //obj.f(); //如果没有extends限制了边界,这里会报错因为泛型已经擦除

        obj.f();
    }

    public static void main(String[] args) {
        HasF hasF = new HasF();

        Manipulator<HasF> manipulator = new Manipulator<>(hasF);

        manipulator.test();
    }

}

class HasF{

    public void f(){
        System.out.println("HasF.f()");
    };

}