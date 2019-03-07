package com.hfview.Iterator;

/**
 * 第一个内部类
 *
 * @author: zhw
 * @since: 2019/3/7 14:24
 */
public class Sequence {

    /**数组*/
    private Object[] value;

    /**下一个元素索引*/
    int next = 0;

    public Sequence(int length){
        if(length<=0){
            System.out.println("please input lt 0");
            return;
        }

        value = new Object[length];
    }

    public void add(Object obj){
        if(next<value.length){
            value[next++] = obj;
        }
    }

    /**
     * 模拟迭代
     */
    private class SequenceSelector implements ISelector{

        /**迭代当前值*/
        private int i=0;

        public boolean end(){
            return i ==value.length;
        }

        public Object current(){
            return value[i];
        }

        public void next(){
            if(i<value.length){
                i++;
            }
        }
    }

    public SequenceSelector selector(){
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        final int length  = 10;
        Sequence sequence = new Sequence(length);
        for(int i=0;i<length;i++){
            sequence.add(i+"");
        }

        ISelector sequenceSelector = sequence.selector();
        while(!sequenceSelector.end()){
            System.out.println(sequenceSelector.current());
            sequenceSelector.next();
        }
    }

}
