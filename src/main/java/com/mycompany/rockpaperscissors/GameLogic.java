package com.mycompany.rockpaperscissors;

import java.util.Random;

public class GameLogic {

    private Random rnd;

    public GameLogic() {
        rnd = new Random();
    }

    
    public String play() {
        int hand = rnd.nextInt(3);
        switch (hand) {
            case (0):
                return "Rock";
            case (1):
                return "Paper";
            case (2):
                return "Scissors";
            default:
                return "null";
        }
    }

}
