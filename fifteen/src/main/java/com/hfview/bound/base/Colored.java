package com.hfview.bound.base;

import java.awt.*;

/**
 * 此时Colored<T extends IHasColor>的T
 * 算是覆盖了HoldItem<T>中的T
 * @author: zhw
 * @since: 2019/3/19 17:13
 */
public class Colored<T extends IHasColor> extends HoldItem<T>{

    public Colored(T item) {
        super(item);
    }

    /**
     * 因为擦除到边界IHasColor，所以可以放翁getColor()方法
     * @return
     */
    Color color(){
        return item.getColor();
    }
}
