package com.hfview.bound.wildcard;

import java.util.Arrays;
import java.util.List;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/20 14:02
 */
public class MethodInvokeDemo1{

    /**
     * ? extends MyDemo1
     * 一种List类型集合，该类型是MyDemo1的一种子类(包括自己)
     *
     * @param list
     */
    public static void test1(List<? extends MyDemo1> list){
        MyDemo1 myDemo1 = list.get(0);
        MyDemo11 myDemo11 = (MyDemo11) list.get(1);

        System.out.println(myDemo1);
        System.out.println(myDemo11);


        //list.add(new MyDemo11()) 报错
    }

    /**
     * ? super MyDemo1
     * 一种List类型集合，该种类型是MyDemo1的某个基类(包括自己)
     *
     * @param list
     */
    public static void test2(List<? super MyDemo1> list){

        list.add(new MyDemo1());
        list.add(new MyDemo11());
        list.add(new MyDemo12());

    }


    public static void test3(List<?> list) {


    }


    public static void main(String[] args) {
        List<MyDemo> listMyDemo = Arrays.asList(new MyDemo(),new MyDemo());
        List<MyDemo1> listMyDemo1 = Arrays.asList(new MyDemo1(),new MyDemo1());
        List<MyDemo11> listMyDemo11 = Arrays.asList(new MyDemo11(),new MyDemo11());


        test1(listMyDemo11);//test1是MyDemo1的子类集合

        test2(listMyDemo);//test1是MyDemo1的基类集合

        test3(listMyDemo1);
    }

}

class MyDemo{

}

class MyDemo1 extends MyDemo{

}

class MyDemo11 extends MyDemo1{

}

class MyDemo12 extends MyDemo1{

}