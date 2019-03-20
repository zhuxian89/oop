package com.hfview.bound.base;

/**
 * 多个限定 先类后接口.
 * 然后给T再次增加边界
 * @author: zhw
 * @since: 2019/3/19 17:18
 */
public class ColorDimension<T extends Dimension&IHasColor> extends Colored<T>{

    public ColorDimension(T item) {
        super(item);
    }

    /**
     * 边界限定为Dimension和IHasColor 就可以调用getClor也可以是调用
     * Dimension中的x
     * @return
     */
    int getX(){
        return item.x;
    }

}
