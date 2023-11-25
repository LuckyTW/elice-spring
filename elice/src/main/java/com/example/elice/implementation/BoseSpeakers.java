package com.example.elice.implementation;

import com.example.elice.interfaces.Speakers;
import com.example.elice.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(Song song){
        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with Bose speakers";
    }

}
