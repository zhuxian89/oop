package com.hfview.Upcase;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/7 15:28
 */
public class Main {

    public static void main(String[] args) {
        Parce14 parce14 = new Parce14();
        IContents contents = parce14.contents();
        IDestination destination = parce14.destination();

        System.out.println(contents.value());

        System.out.println(destination.readLabel());
    }

}
