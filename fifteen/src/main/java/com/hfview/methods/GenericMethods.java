package com.hfview.methods;

import org.apache.poi.ss.formula.functions.T;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/19 10:32
 */
public class GenericMethods {

    /**
     * 方法更通用，这个时候T虽然也是声明一个类型，但是该方法基本上是重载了很多次。
     * 这样的方法才是通用方法。
     *
     * 创接类的时候无需指定方法的参数类型，编译器会通过类型参数推断
     * @param t
     * @param <T>
     */
    public static <T> void test(T t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {

        /**
         * 泛型是不能应用于基本类型的，但是java有自动拆箱和装箱操
         * 所以这个也不是问题。
         */
        test("1");
        test(1);
        test(1l);
        test(1d);
        test(new GenericMethods());
    }

}
