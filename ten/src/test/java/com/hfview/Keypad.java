package com.hfview;

/**
 * 请求者(包含命令)
 *
 * @author: zhw
 * @since: 2019/3/8 17:24
 */
public class Keypad {

    public ICommand playCommand;

    public void setPlayCommand(ICommand playCommand){
        this.playCommand = playCommand;
    }

    public void action(){
        playCommand.execute();
    }
}
