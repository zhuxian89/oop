package com.hfview.bound.wildcard;

import com.hfview.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/20 09:39
 */
public class GenericAndCovariance {

    public static void main(String[] args) {

        /**
         *
         */
        List<? extends Fruit> list = new ArrayList<Apple>();

        //list.add(new Apple());

        //list.add(new Fruit());

        list.add(null);


        List<? extends Fruit> list1 = Arrays.asList(new Apple());

        Fruit fruit = list1.get(0);

        System.out.println(list1.contains(new Apple()));

        System.out.println(fruit);

    }

}
