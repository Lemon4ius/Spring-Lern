package com.FirstLernSpring.FirstSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    MusicPLayer musicPLayer;
    int id;

    @Autowired
    public Computer(MusicPLayer musicPLayer) {
        this.musicPLayer = musicPLayer;
        this.id = 1;
    }

//    @Override
//    public String toString() {
//        return "Comp "+ id + " " + musicPLayer.playMusic();
//    }
}
