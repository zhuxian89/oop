package com.hfview;

/**
 * 具体命令角色（包含执行者）
 *
 * @author: zhw
 * @since: 2019/3/8 17:25
 */
public class PlayCommand implements ICommand{

    AudioPlayer audioPlayer;


    public PlayCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
