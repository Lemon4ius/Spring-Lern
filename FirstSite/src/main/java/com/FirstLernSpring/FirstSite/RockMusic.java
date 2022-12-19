package com.FirstLernSpring.FirstSite;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> musics=new ArrayList<>();
    {musics.add("Skrillex");
        musics.add("Жетский рок");
        musics.add("метал");
    }
    @Override
    public List getSong() {

        return musics;
    }
}
