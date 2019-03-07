package com.hfview.anonymous;

import com.hfview.Upcase.IContents;

/**
 * 匿名内部类，类创建的时候就生成对象，而且不能实现多个接口
 * @author: zhw
 * @since: 2019/3/7 16:39
 */
public class Parce7 {

    public IContents contents(){
        return new IContents() {
            @Override
            public int value() {
                return 10;
            }
        };
    }

    public static void main(String[] args) {
        Parce7 parce7 = new Parce7();
        IContents contents = parce7.contents();
        System.out.println(contents.value());
    }


}
