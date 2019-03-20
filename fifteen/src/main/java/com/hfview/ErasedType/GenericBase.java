package com.hfview.ErasedType;

import org.apache.poi.ss.formula.functions.T;

/**
 *  通过字节码观察擦除只是语法糖
 *
 * @author: zhw
 * @since: 2019/3/19 15:40
 */
public class GenericBase<T> {

    private T element;

    public void set(T arg){
        element = arg;
    }

    public T get(){
        return element;
    }

    public static void main(String[] args) {
        Derived2 derived2 = new Derived2();
        GenericBase genericBase = new GenericBase();
        genericBase.set(derived2);

        Derived2 derived3 = (Derived2) genericBase.get();
    }

}

class Derived2{

}


