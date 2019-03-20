package com.hfview.extend;

import net.bytebuddy.agent.ByteBuddyAgent;

/**
 * 如果其他类想继承某个内部类，因为内部类需要有外围类的引用，所以一定要初始化外围类
 * 这里必须采用特殊的语法。
 * enclosingClassReference.close()
 *
 * @author: zhw
 * @since: 2019/3/11 09:12
 */
class WithInner {

    public WithInner(){
        System.out.println("WithInner");
    }

    class Inner {
        public Inner(){
            System.out.println("WithInner of Inner");
        }
    }
}

public class InheritInner extends WithInner.Inner{

    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}


