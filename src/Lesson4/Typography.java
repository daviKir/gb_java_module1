package Lesson4;

public class Typography {
  public static final char FIGURE_X = 'X';
  public static final char FIGURE_O = '0';
  public static final char FIGURE_EMPTY = '•';

  public static final String WELCOME = """
      ████████╗██╗░█████╗░░░░░░░████████╗░█████╗░░█████╗░░░░░░░████████╗░█████╗░███████╗
      ╚══██╔══╝██║██╔══██╗░░░░░░╚══██╔══╝██╔══██╗██╔══██╗░░░░░░╚══██╔══╝██╔══██╗██╔════╝
      ░░░██║░░░██║██║░░╚═╝█████╗░░░██║░░░███████║██║░░╚═╝█████╗░░░██║░░░██║░░██║█████╗░░
      ░░░██║░░░██║██║░░██╗╚════╝░░░██║░░░██╔══██║██║░░██╗╚════╝░░░██║░░░██║░░██║██╔══╝░░
      ░░░██║░░░██║╚█████╔╝░░░░░░░░░██║░░░██║░░██║╚█████╔╝░░░░░░░░░██║░░░╚█████╔╝███████╗
      ░░░╚═╝░░░╚═╝░╚════╝░░░░░░░░░░╚═╝░░░╚═╝░░╚═╝░╚════╝░░░░░░░░░░╚═╝░░░░╚════╝░╚══════╝
      """;
  public static final String SET_MODE = "Выберете режим игры\n1 - поле 3x3. Победа при сборе последовательности из 3 фигур\n2 - поле 5x5. Победа при сборе последовательности из 4 фигур";
  public static final String SET_LEVEL = "Выберете уровень сложности\n1 - Легкий\n2 - Нормальный";
  public static final String SET_FIGURE = "Выберете фигуру\n1 - X\n2 - 0";


  public static final String NUMBER_OUT_RANGE_F = "Введите число от %d до %d";

  public static final String START_GAME = "Первым ходит игрок\n";
  public static final String ENTER_ROW = "Введите номер строки:";
  public static final String ENTER_COL = "Введите номер столбца:";
  public static final String BUSY_CELL = "Эта ячейка уже занята";

  public static final String DRAW_MSG = "Ничья!";
  public static final String WIN_MSG_F = "Победил %s";
}
