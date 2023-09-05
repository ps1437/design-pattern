package com.syscho.pattern.tictoe;

public class GameMain {
    public static void main(String[] args) {
        Game game = new Game();
        game.initializeGame();
        String winner = game.startGame();
        System.out.println("Winner  - " + winner);

    }
}
