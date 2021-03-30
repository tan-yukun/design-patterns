package com.tan.yukun.decorator;

import com.tan.yukun.decorator.achieves.ChineseSaviorCrepe;
import com.tan.yukun.decorator.achieves.Egg;
import com.tan.yukun.decorator.achieves.IOExample;
import com.tan.yukun.decorator.achieves.Sauce;
import com.tan.yukun.decorator.interfaces.ChineseFood;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        ChineseFood chineseSaviorCrepe = new ChineseSaviorCrepe();
        System.out.println("已点: " + chineseSaviorCrepe.getDescription() + "; 价格: " + chineseSaviorCrepe.cost());
        chineseSaviorCrepe = new Egg(chineseSaviorCrepe);
        chineseSaviorCrepe = new Egg(chineseSaviorCrepe);
        chineseSaviorCrepe = new Sauce(chineseSaviorCrepe);
        System.out.println("已点: " + chineseSaviorCrepe.getDescription() + "; 价格: " + chineseSaviorCrepe.cost());

        int c;
        try {
            IOExample ioExample = new IOExample(new BufferedInputStream(new FileInputStream("example.txt")));
            while((c = ioExample.read()) >= 0) {
                System.out.print((char)c);
            }
            ioExample.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
