package com.FirstLernSpring.FirstSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPLayer {

    Music music;
    Music music1;
    @Autowired
    ClassicalMusic classicalMusic;
    @Autowired
    RockMusic rockMusic;


    public MusicPLayer() {
    }

    //    public MusicPLayer(@Qualifier("classicalMusic") Music music, @Qualifier("rockMusic") Music music2) {
//        this.music = music;
//        this.music1 = music2;
//    }

    @Autowired
    public void setMusic(@Qualifier("classicalMusic") Music music) {
        this.music = music;
    }

    @Autowired
    public void setMusic1(@Qualifier("rockMusic") Music music1) {
        this.music1 = music1;
    }

    public String playMusic(Stiles stiles) {

        switch (stiles) {
            case CLASSICAL:
                Random random = new Random();

                return classicalMusic.getSong().get(random.nextInt(3)).toString();

            case ROCK:
                Random random2 = new Random();

                return rockMusic.getSong().get(random2.nextInt(3)).toString();
            default:
                return null;

        }

    }


}
