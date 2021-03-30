package com.tan.yukun.command;

import com.tan.yukun.command.achieves.LightOffCommand;
import com.tan.yukun.command.achieves.LightOnCommand;
import com.tan.yukun.command.achieves.SimpleRemoteControl;
import com.tan.yukun.command.interfaces.Light;

/**
 * @author tan_y
 */
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setSlot(new LightOnCommand(new Light()));
        control.buttonWasPressed();
        control.setSlot(new LightOffCommand(new Light()));
        control.buttonWasPressed();
    }


}
