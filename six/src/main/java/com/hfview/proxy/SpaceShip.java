package com.hfview.proxy;

/**
 * 太空飞船类
 * 演示继承和组合中庸之道-----代理
 * 虽然是组合，但是飞船控制器的所有接口方法都在新类太空飞船中实现了，又好像继承。
 * 其实我感觉这个不就是组合的特殊方式
 * 飞船和飞船控制器并非is-a关系，更像has-a关系
 * @author: zhw
 * @since: 2019/3/5 14:13
 */
public class SpaceShip {

    private SpaceShipControls spaceShipControls;

    public void up(){
        spaceShipControls.up();
    }

    public void down(){
        spaceShipControls.down();
    }

    public void forward(){
        spaceShipControls.forward();
    }

    public void back(){
        spaceShipControls.back();
    }

}

/**
 * 飞船控制器
 */
class SpaceShipControls{

    public void up(){

    }

    public void down(){

    }

    public void forward(){

    }

    public void back(){

    }
}
