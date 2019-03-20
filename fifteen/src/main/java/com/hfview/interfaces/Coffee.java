package com.hfview.interfaces;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/19 09:47
 */
public class Coffee {

    private static int count;

    private final int id = count++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+"  id:"+id;
    }
}

class Latter extends Coffee{

}

class Mocha extends Coffee{

}

class Cappuccino extends Coffee{

}