package com.hfview.interfaces.AdapterImplement;

import com.hfview.interfaces.InterfaceImplement.Process;
import com.hfview.interfaces.NewClassConstuctor.HighPass;
import com.hfview.interfaces.NewClassConstuctor.LowPass;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 11:51
 */
public class Main {

    public static void apply(Process p, Object input){
        p.name();
        p.process(input);
    }

    public static void main(String[] args) {
        apply(new FilterAdapter(new HighPass()),"highpass");
       apply(new FilterAdapter(new LowPass()),"lowpass");
    }

}
