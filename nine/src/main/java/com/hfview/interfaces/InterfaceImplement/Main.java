package com.hfview.interfaces.InterfaceImplement;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 11:43
 */
public class Main {

    public static String apply(Process p,Object input){
        p.name();
        return p.process(input).toString();
    }

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(apply(new Upcase(),"upcase"));
        System.out.println(apply(new DownCase(),"downcase"));
    }

}
