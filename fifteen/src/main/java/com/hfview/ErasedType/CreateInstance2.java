package com.hfview.ErasedType;

import io.lettuce.core.output.StatusOutput;
import org.apache.poi.ss.formula.functions.T;

/**
 * CreateInstance2<T> 中T来限制创造对象的类型
 *
 * F:实现了Factory<T></> 工厂的类
 *
 * @author: zhw
 * @since: 2019/3/19 16:34
 */
public class CreateInstance2<T> {

    T t;

    public <F extends Factory<T> > T create(F factory){
        return factory.create();
    }

    public static void main(String[] args) {

        CreateInstance2<Integer> createInstance2 = new CreateInstance2();

        IntegerFactory factory = new IntegerFactory();

        System.out.println(createInstance2.create(factory));
    }

    public void get(){
        System.out.println(t);
    }

}


interface Factory<T>{

    T create();
}

class IntegerFactory implements Factory<Integer>{

    @Override
    public Integer create() {
        return  new Integer(0);
    }
}