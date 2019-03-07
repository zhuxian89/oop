package com.hfview.AccessPermission;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/7 15:47
 */
public class Main {

    public static void main(String[] args) {
        Pc pc = new Pc();

        ICpu cpu = pc.cpu();
        //pc.new Cpu(); 这里会报错,private只要在Pc内部才可以访问，这种方式算是对内部类完全隐藏
        //只能访问接口中的方法，想访问内部类的成员是不可能的

        cpu.showName();

        IHardDisk hardDisk = pc.hardDisk();
        //pc.new HardDisk();//protected PC内部、PC的子类、相同的包
        hardDisk.showName();


        IMotherboard motherboard = pc.motherboard();
        //pc.new Motherboard()；//public 所有地方
        motherboard.showName();
    }

}
