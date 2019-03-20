package com.hfview.bound.base;

/**
 *  泛型之extends
 *
 * @author: zhw
 * @since: 2019/3/19 17:35
 */
public class Main {

    public static void main(String[] args) {

        Bounded bounded = new Bounded();

        ColorDimension<Bounded> colorDimension = new ColorDimension<>(bounded);

        colorDimension.color();
    }

}
