package com.spring.core.chap02_2.practice.q2.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusicConfig {

    @Bean
    public Speaker speaker() {
        return new Speaker();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.setSpeaker(speaker());

        return musicPlayer;
    }
}
