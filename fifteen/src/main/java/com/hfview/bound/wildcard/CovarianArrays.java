package com.hfview.bound.wildcard;

import com.hfview.App;

import java.util.ArrayList;
import java.util.List;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/20 09:17
 */
public class CovarianArrays {

    public static void main(String[] args) {

        Fruit[] fruits = new Apple[10];

        fruits[0] = new Apple();

        fruits[1] = new Jonathan();

        try {
            fruits[0] = new Fruit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fruits[0] = new Orange();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class Fruit{

}

class Apple extends Fruit{

}

class Jonathan extends Apple{

}

class Orange extends Fruit{

}
