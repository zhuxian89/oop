package com.hfview.interfaces.AdapterImplement;

import com.hfview.interfaces.InterfaceImplement.Process;
import com.hfview.interfaces.NewClassConstuctor.Filter;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/6 11:50
 */
public class FilterAdapter implements Process {

    private Filter filter;

    public FilterAdapter(Filter filter){
        this.filter = filter;
    }

    @Override
    public void name() {
        filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process(input);
    }
}
