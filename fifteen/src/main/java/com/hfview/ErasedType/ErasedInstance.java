package com.hfview.ErasedType;

/**
 * 泛型的instanceOf方法:
 * 因为不能直接 obj instanceOf T，所以利用类型标签来完成
 *
 * @author: zhw
 * @since: 2019/3/19 16:01
 */
public class ErasedInstance<T> {

    private final int SIZE=100;

    Class<T> kind;

    public ErasedInstance(Class<T> kind){
        this.kind = kind;
    }

    public void f(Object obj){

        System.out.println(kind.isInstance(obj));
    }

    public static void main(String[] args) {

        ErasedInstance<String> erased = new ErasedInstance<>(String.class);

        erased.f("11");

    }

}
