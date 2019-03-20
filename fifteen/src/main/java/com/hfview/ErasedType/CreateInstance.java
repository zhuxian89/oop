package com.hfview.ErasedType;

import org.apache.poi.ss.formula.functions.T;

/**
 * 类型标签创建对象
 *
 * @author: zhw
 * @since: 2019/3/19 16:34
 */
public class CreateInstance<T> {

    T t;

    /**
     * Class<T> 类型标签本身就是一个内从工程，而且只能调用创建对象的默认构造器
     * 它的局限性就是只能调用默认构造器
     * @param kind
     */
    public CreateInstance(Class<T> kind){
        try {
            t = kind.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public T get(){
        //new T();//这里会报错的

        return t;
    }

    public static void main(String[] args) {

        CreateInstance<MyPhone> createInstance = new CreateInstance<>(MyPhone.class);

        System.out.println(createInstance.get().toString());

    }

}

class MyPhone{

    @Override
    public String toString() {
        return "MyPhone object";

    }
}

