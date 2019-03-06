package com.hfview;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * s是字符串，所以s的值是不可能改变的
     *
     * @param s
     * @return
     */
    public static String appendStr(String s){
        s =s+"bbb";
        return s;
    }

    public static void main( String[] args )
    {
        String s = new String("aaa");
        String ns = appendStr(s);
        System.out.println(ns);
        System.out.println(s);

    }
}
