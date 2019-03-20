package com.hfview;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/8 17:35
 */
public class Main {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        ICommand playCommand = new PlayCommand(audioPlayer);

        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);

        keypad.pay();
    }

}
