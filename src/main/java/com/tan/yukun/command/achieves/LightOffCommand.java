package com.tan.yukun.command.achieves;

import com.tan.yukun.command.interfaces.Command;
import com.tan.yukun.command.interfaces.Light;

/**
 * @author tan_y
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
