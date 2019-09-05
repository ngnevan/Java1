package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameActionListener implements ActionListener {
    private int row;
    private int cell;
    private GameButton button;

    public GameActionListener(int row, int cell, GameButton gButton) {
        this.row = row;
        this.cell = cell;
        this.button = gButton;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameBoard board = button.getBoard();
        if (board.isTurnable(row, cell)) {
            updateByPlayersData(board);
            updateByAiData(board);
/*            if (board.isFull()) {
                board.getGame().showMessage("Ничья!");
                board.emptyField();
            } else {
                updateByAiData(board);
            }
*/
        } else {
            board.getGame().showMessage("Некорректный ход!");
        }
    }

    private void updateByPlayersData(GameBoard board) {
        board.updateGameField(row, cell);

        button.setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));

        if (board.checkWin()) {
            button.getBoard().getGame().showMessage("Вы выиграли!");
            board.emptyField();
        } else if (board.isFull()) {
            board.getGame().showMessage("Ничья!");
            board.emptyField();
        }
        board.getGame().passTurn();
    }

    private void updateByAiData(GameBoard board) {
        int x = -1, y = -1;
        Random rnd = new Random();

        int maxScoreFieldX = -1;
        int maxScoreFieldY = -1;
        int maxScore = 0;

        for (int i = 0; i < GameBoard.dimension; i++) {
            for (int j = 0; j < GameBoard.dimension; j++) {
                int fieldScore = 0;

                if (board.isTurnable(j,i)) {
                    if (i - 1 >= 0 && j - 1 >= 0 && board.getChar(i-1, j-1) == board.getGame().getCurrentPlayer().getPlayerSign()) {
                        fieldScore++;
                    }

                    if (i - 1 >= 0 && board.getChar(i-1, j) == board.getGame().getCurrentPlayer().getPlayerSign()) {
                        fieldScore++;
                    }

                    if (i - 1 >= 0 && j + 1 < GameBoard.dimension && board.getChar(i-1, j+1) == board.getGame().getCurrentPlayer().getPlayerSign()){
                        fieldScore++;
                    }

                    if (j + 1 < GameBoard.dimension && board.getChar(i,j+1) == board.getGame().getCurrentPlayer().getPlayerSign()) {
                        fieldScore++;
                    }

                    if (j - 1 >= 0 && board.getChar(i, j-1) == board.getGame().getCurrentPlayer().getPlayerSign()) {
                        fieldScore++;
                    }

                    if (i + 1 < GameBoard.dimension && j + 1 < GameBoard.dimension && board.getChar(i+1,j+1) == board.getGame().getCurrentPlayer().getPlayerSign()) {
                        fieldScore++;
                    }

                    if (i + 1 < GameBoard.dimension && board.getChar(i+1, j) == board.getGame().getCurrentPlayer().getPlayerSign()) {
                        fieldScore++;
                    }

                    if (i + 1 < GameBoard.dimension && j - 1 > 0 && board.getChar(i+1, j-1) == board.getGame().getCurrentPlayer().getPlayerSign()) {
                        fieldScore++;
                    }
                }

                if (fieldScore > maxScore) {
                    maxScore = fieldScore;
                    maxScoreFieldX = j;
                    maxScoreFieldY = i;
                }
            }

            if (maxScoreFieldX != -1) {
                x = maxScoreFieldX;
                y = maxScoreFieldY;
            }
        }

        if (x == -1) {
            do {
                x = rnd.nextInt(GameBoard.dimension);
                y = rnd.nextInt(GameBoard.dimension);
            } while (!board.isTurnable(x, y));
        }

        board.updateGameField(x, y);

        int cellIndex = GameBoard.dimension * x + y;
        board.getButton(cellIndex).setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));

        if (board.checkWin()) {
            button.getBoard().getGame().showMessage("Компьютер выиграл!");
            board.emptyField();
        } else if (board.isFull()) {
            board.getGame().showMessage("Ничья!");
            board.emptyField();
        }
        board.getGame().passTurn();
    }
}
