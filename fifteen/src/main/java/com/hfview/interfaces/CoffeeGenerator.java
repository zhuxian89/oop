package com.hfview.interfaces;

import org.apache.commons.lang3.RandomUtils;

import java.util.Iterator;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/19 09:50
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee>{

    private Class[] types = {Latter.class,Mocha.class,Cappuccino.class};

    int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    public CoffeeGenerator() {
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[RandomUtils.nextInt(0,types.length)].newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Itr();
    }

    class Itr implements Iterator<Coffee> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public Coffee next() {
            try {
                return (Coffee) types[index++].newInstance();
            }catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("not implement");
        }

    }

    public static void main(String[] args) {

        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();

        for(int i=0;i<5;i++){
            System.out.println(coffeeGenerator.next());
        }

        System.out.println("---------------iterator---------------");

        for(Coffee coffee:new CoffeeGenerator(3)){
            System.out.println(coffee);
        }
    }
}
