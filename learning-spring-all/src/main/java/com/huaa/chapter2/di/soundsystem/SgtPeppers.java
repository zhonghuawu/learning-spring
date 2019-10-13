package com.huaa.chapter2.di.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/4 22:29
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
