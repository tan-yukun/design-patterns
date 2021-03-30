package com.tan.yukun.command.achieves;

import com.tan.yukun.command.interfaces.Command;
import com.tan.yukun.command.interfaces.Light;

/**
 * @author tan_y
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
