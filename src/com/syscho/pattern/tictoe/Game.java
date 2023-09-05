package com.syscho.pattern.tictoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> players;

    Board gameBoard;


    public void initializeGame() {

        players = new LinkedList<>();

        PlayingPieceO o = new PlayingPieceO();
        PlayingPieceX x = new PlayingPieceX();

        Player player = new Player("()", o);
        Player player2 = new Player("X", x);

        players.add(player);
        players.add(player2);

        gameBoard = new Board(3);


    }

    public String startGame() {
        boolean noWinner = true;

        while (noWinner) {

            Player playerTurn = players.removeFirst();
            //get the free space from the board
            gameBoard.printBoard();

            List<Pair<Integer, Integer>> freeSpaces = gameBoard.freeCell();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");

            if (values.length != 2) {
                System.out.println("Incorrect Enter col and row both");
                players.addFirst(playerTurn);
                continue;
            }

            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);
            boolean pieceAddedSuccessfully = false;
            try {
                pieceAddedSuccessfully = gameBoard.add(inputRow, inputColumn, playerTurn.getPlayingPiece());

            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                pieceAddedSuccessfully = false;
            }
            if (!pieceAddedSuccessfully) {

                System.out.println("Incorrect possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().pieceType);
            if (winner) {
                return playerTurn.getName();
            }

        }
        return "tie";


    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}
