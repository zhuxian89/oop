package com.hfview.interfaces.ClassImplement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 11:42
 */
public class Main {

    public static void apply(Process p,Object input){
        p.name();
        p.process(input);
    }

    public static void main(String[] args) throws Exception {
        apply(new Upcase(),"upcase");
        apply(new Downcase(),"downcase");
    }


}
