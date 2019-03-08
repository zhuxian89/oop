package com.hfview.AccessPermission;

/**
 * 内部类的访问权限
 *
 * @author: zhw
 * @since: 2019/3/7 15:44
 */
public class Pc {

    static int disk = 2;

    private class Cpu implements ICpu{

        //Inner classes cannot have static declaration
        //static int aa = 1;
        @Override
        public void showName() {
            System.out.println("cpu");
        }
    }

    public Cpu cpu(){
        return new Cpu();
    }

    protected class HardDisk implements IHardDisk{

        @Override
        public void showName() {
            System.out.println("harddisk");
        }
    }

    public HardDisk hardDisk(){
        return new HardDisk();
    }

    public class Motherboard implements IMotherboard{

        @Override
        public void showName() {
            System.out.println("montherboard");
        }
    }

    public Motherboard motherboard(){
        return new Motherboard();
    }

}
