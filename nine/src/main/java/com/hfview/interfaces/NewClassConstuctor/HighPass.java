package com.hfview.interfaces.NewClassConstuctor;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 11:40
 */
public class HighPass extends Filter {

    public String process(Object input){
        return input.toString().toUpperCase();
    }

}
