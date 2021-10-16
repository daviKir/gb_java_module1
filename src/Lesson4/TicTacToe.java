package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
  private static final int GAME_BOARD_SMALL_SIZE = 3;
  private static final int GAME_BOARD_MEDIUM_SIZE = 5;

  private static int gameBoardSize;
  private static int gameMode;
  private static int gameLevel;
  private static char playerFigure;
  private static char aiFigure;
  private static char[][] gameBoard;

  private static Scanner scanner;
  private static Random random;

  public static void main(String[] args) {
    initGame();
    System.out.println(Typography.START_GAME);
    renderGameBoard();
    gameLoop();
  }

  private static void initGame() {
    scanner = new Scanner(System.in);
    random = new Random();

    System.out.println(Typography.WELCOME);

    System.out.println(Typography.SET_MODE);
    gameMode = readAndValidateInRange(scanner, 1, 2);
    System.out.println();

    System.out.println(Typography.SET_LEVEL);
    gameLevel = readAndValidateInRange(scanner, 1, 2);
    System.out.println();

    System.out.println(Typography.SET_FIGURE);
    if (readAndValidateInRange(scanner, 1, 2) == 1) {
      playerFigure = Typography.FIGURE_X;
      aiFigure = Typography.FIGURE_O;
    } else {
      aiFigure = Typography.FIGURE_X;
      playerFigure = Typography.FIGURE_O;
    }
    System.out.println();

    gameBoardSize = gameMode == 1 ? GAME_BOARD_SMALL_SIZE : GAME_BOARD_MEDIUM_SIZE;

    gameBoard = new char[gameBoardSize][gameBoardSize];

    for (char[] row : gameBoard) {
      Arrays.fill(row, Typography.FIGURE_EMPTY);
    }
  }

  private static void renderGameBoard() {
    renderHeader();
    for (int i = 0; i < gameBoardSize; i++) {
      System.out.print(i + 1);
      for (int j = 0; j < gameBoardSize; j++) {
        System.out.print(" " + gameBoard[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

  private static void renderHeader() {
    for (int i = 0; i <= gameBoardSize; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  private static void gameLoop() {
    while (true) {
      playerTurn();
      renderGameBoard();
      if (checkEndGame(playerFigure)) {
        break;
      }

      aiTurn();
      renderGameBoard();
      if (checkEndGame(aiFigure)) {
        break;
      }
    }
  }

  private static void playerTurn() {
    int maxRange = gameMode == 1 ? 3 : 5;
    while (true) {
      System.out.println(Typography.ENTER_ROW);
      int row = readAndValidateInRange(scanner, 1, maxRange);
      System.out.println(Typography.ENTER_COL);
      int col = readAndValidateInRange(scanner, 1, maxRange);
      if (isEmptyCell(row - 1, col - 1)) {
        gameBoard[row - 1][col - 1] = playerFigure;
        break;
      } else {
        System.out.println(Typography.BUSY_CELL);
      }
    }
    System.out.println();
  }

  private static void aiTurn() {
    switch (gameLevel) {
      case 1 -> {
        aiSimpleMoveGeneration();
      }
      case 2 -> {
        boolean aiMadeMove = tryMove(false);
        if (!aiMadeMove) {
          aiMadeMove = tryMove(true);
        }
        if (!aiMadeMove) {
          aiSimpleMoveGeneration();
        }
      }
    }
    System.out.println();
  }

  private static void aiSimpleMoveGeneration() {
    int maxRange = gameMode == 1 ? 2 : 4;
    while (true) {
      int row = random.nextInt(maxRange);
      int col = random.nextInt(maxRange);
      if (isEmptyCell(row, col)) {
        gameBoard[row][col] = aiFigure;
        break;
      }
    }
  }

  public static int readAndValidateInRange(Scanner scanner, int rangeStart, int rangeEnd) {
    while (true) {
      if (!scanner.hasNextInt()) {
        System.out.printf(Typography.NUMBER_OUT_RANGE_F + '\n', rangeStart, rangeEnd);
        scanner.next();
      } else {
        int playerInput = scanner.nextInt();
        if (playerInput < rangeStart || playerInput > rangeEnd) {
          System.out.printf(Typography.NUMBER_OUT_RANGE_F + '\n', rangeStart, rangeEnd);
        } else {
          return playerInput;
        }
      }
    }
  }

  private static boolean isEmptyCell(int row, int col) {
    return gameBoard[row][col] == Typography.FIGURE_EMPTY;
  }

  private static boolean checkEndGame(char figure) {
    if (isMapFull()) {
      System.out.println(Typography.DRAW_MSG);
      return true;
    }

    if (isWin(figure)) {
      System.out.printf(Typography.WIN_MSG_F, figure == playerFigure ? "игрок" : "компьютер");
      return true;
    }

    return false;
  }

  private static boolean isWin(char symbol) {
    int winSum = gameMode == 1 ? 3 : 4;
    int sumInRow = 0;
    int sumInCol = 0;
    int sumInMineDiagonal = 0;
    int sumInMinorDiagonal = 0;

    for (int i = 0; i < gameBoardSize; i++) {
      for (int j = 0; j < gameBoardSize; j++) {
        sumInRow = gameBoard[i][j] == symbol ? sumInRow + 1 : 0;
        sumInCol = gameBoard[i][j] == symbol ? sumInCol + 1 : 0;

        if (j == i && gameBoard[j][i] == symbol) {
          sumInMineDiagonal++;
        }

        if (j == (gameBoard[i].length - 1 - i) && gameBoard[j][i] == symbol) {
          sumInMinorDiagonal++;
        }
      }

      if (sumInRow >= winSum || sumInCol >= winSum || sumInMineDiagonal >= winSum || sumInMinorDiagonal >= winSum) {
        return true;
      }

      sumInRow = 0;
      sumInCol = 0;
    }

    return false;
  }

  private static boolean isMapFull() {
    for (int i = 0; i < gameBoardSize; i++) {
      for (int j = 0; j < gameBoardSize; j++) {
        if (isEmptyCell(i, j)) {
          return false;
        }
      }
    }

    return true;
  }

  private static boolean checkPosition(int row, int col, char figure) {
    gameBoard[row][col] = figure;
    boolean win = isWin(figure);
    gameBoard[row][col] = Typography.FIGURE_EMPTY;
    return win;
  }

  private static boolean tryMove(boolean checkToLose) {
    for (int i = 0; i < gameBoardSize; i++) {
      for (int j = 0; j < gameBoardSize; j++) {
        if(isEmptyCell(i, j)) {
          if (checkPosition(i, j, checkToLose ? playerFigure : aiFigure)) {
            gameBoard[i][j] = aiFigure;
            return true;
          }
        }
      }
    }
    return false;
  }
}
