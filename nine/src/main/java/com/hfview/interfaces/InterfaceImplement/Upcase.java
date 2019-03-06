package com.hfview.interfaces.InterfaceImplement;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 10:55
 */
public class Upcase extends AbstractStringProcess {

    @Override
    public String process(Object input) {
        return input.toString().toUpperCase();
    }
}
