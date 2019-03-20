package com.hfview.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author: zhw
 * @since: 2019/3/19 10:57
 */
public class New {

    public static <K,V> Map<K,V> map(){
        return new HashMap<K,V>();
    }

    public static <T> List<T> list(){
        return new ArrayList<T>();
    }

}
