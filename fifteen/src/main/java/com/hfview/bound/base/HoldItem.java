package com.hfview.bound.base;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/19 17:19
 */
public class HoldItem<T> {
    T item;

    public HoldItem(T item){
        this.item = item;
    }

    T getItem(){
        return item;
    }
}
