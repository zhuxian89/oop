package com.hfview.Tuple;

import sun.applet.Main;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/19 09:37
 */
public class TwoTuple<A,B> {

    public final A first;

    public final B second;

    public TwoTuple(A a,B b){
        this.first =a;
        this.second = b;
    }

    @Override
    public String toString() {
        return "("+first+","+second+")";
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> twoTuple =  new TwoTuple<String,Integer>("a",1);
        System.out.println(twoTuple);
    }
}
