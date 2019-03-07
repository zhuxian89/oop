package com.hfview.Iterator;

/**
 * 迭代器的接口
 *
 * @author: zhw
 * @since: 2019/3/7 14:47
 */
public interface ISelector {

    boolean end();

    Object current();

    void next();

}
