package com.lozz.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    // Constructor-based dependencies
    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
