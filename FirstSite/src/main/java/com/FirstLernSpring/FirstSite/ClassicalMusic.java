package com.FirstLernSpring.FirstSite;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> musics = new ArrayList<>();

    {
        musics.add("На поляне");
        musics.add("не на поляне");
        musics.add("Бит хувин");
    }
    @Override
    public List getSong() {

        return musics;
    }
}
