package org.example.model;

import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private  int nextMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;

    public static class Builder{

    }
}
