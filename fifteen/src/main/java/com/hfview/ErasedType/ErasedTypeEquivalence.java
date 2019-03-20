package com.hfview.ErasedType;

import java.util.*;

/**
 *  获取泛型的类型信息
 *
 * @author: zhw
 * @since: 2019/3/19 14:31
 */


public class ErasedTypeEquivalence {




    public static void main(String[] args) {

        Class c1 = new ArrayList<Integer>().getClass();

        Class c2 = new ArrayList<String>().getClass();

        System.out.println(c1==c2);

        List<Frob> list = new ArrayList<>();

        Map<Frob,Fnorkle> map = new HashMap<>();

        Quark<Fnorkle> quark = new Quark<Fnorkle>();

        Particle<Long,Double> p = new Particle<>();

        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));

    }

}

class Frob{};

class Fnorkle{};

class Quark<Q>{};

class Particle<P,M>{};