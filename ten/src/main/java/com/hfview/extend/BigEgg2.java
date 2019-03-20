package com.hfview.extend;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/11 09:34
 */
class Egg2{

    public Egg2(){
        System.out.println("new Egg2()");
    }

    private Yolk y = new Yolk();

    public void insertYolk(Yolk yy){
        this.y = yy;
    }

    public void g(){
        y.f();
    }

    protected class Yolk{
        public Yolk(){
            System.out.println("Egg2.Yolk()");
        }

        public void f(){
            System.out.println("EGG2.Yolk.y()");
        }
    }

}



public class BigEgg2 extends Egg2{

    public class Yolk extends Egg2.Yolk{
        public Yolk(){
            System.out.println("BigEgg2.Yolk()");
        }

        public void f(){
            System.out.println("BigEgg2.Yolk.y()");
        }
    }

    public BigEgg2(){
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        BigEgg2 bigEgg2 = new BigEgg2();
        bigEgg2.g();
    }

}
