package com.hfview.methods;

import com.hfview.interfaces.Coffee;
import com.hfview.interfaces.CoffeeGenerator;
import com.hfview.interfaces.Generator;
import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.Collection;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/19 11:16
 */
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gene, int n){

        for(int i=0;i<n;i++){
            coll.add(gene.next());
        }
        return coll;
    }

    public static void main(String[] args) {

        Collection<Coffee> collection = fill(new ArrayList<Coffee>(),new CoffeeGenerator(),5);

        for(Coffee coffee:collection){
            System.out.println(coffee);
        }
    }


}
