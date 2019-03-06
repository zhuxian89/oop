package com.hfview.interfaces.InterfaceImplement;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 10:56
 */
public class DownCase extends AbstractStringProcess {

    @Override
    public String process(Object input) {
        return input.toString().toLowerCase();
    }
}
