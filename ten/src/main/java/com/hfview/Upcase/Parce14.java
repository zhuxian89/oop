package com.hfview.Upcase;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/7 15:25
 */
public class Parce14 {

    private class Contents implements IContents{

        @Override
        public int value() {
            return 0;
        }
    }

    protected class Destination implements IDestination{

        @Override
        public String readLabel() {
            return "Destination";
        }
    }

    public IContents contents(){
        return new Contents();
    }

    public IDestination destination(){
        return new Destination();
    }

}
