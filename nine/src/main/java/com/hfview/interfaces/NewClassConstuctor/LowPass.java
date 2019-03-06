package com.hfview.interfaces.NewClassConstuctor;

import java.io.File;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 11:40
 */
public class LowPass extends Filter {

    public String process(Object input){
        return input.toString().toUpperCase();
    }

}
