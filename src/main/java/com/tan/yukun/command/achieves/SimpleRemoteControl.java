package com.tan.yukun.command.achieves;

import com.tan.yukun.command.interfaces.Command;

/**
 * @author tan_y
 */
public class SimpleRemoteControl {
    Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
