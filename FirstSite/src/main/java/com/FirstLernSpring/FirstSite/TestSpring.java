package com.FirstLernSpring.FirstSite;

import org.apache.logging.log4j.util.MessageSupplier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPLayer musicPLayer=context.getBean("musicPLayer", MusicPLayer.class);

        Stiles stiles = Stiles.CLASSICAL;

        System.out.println(musicPLayer.playMusic(stiles));
//
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer.toString());
        context.close();
    }
}
