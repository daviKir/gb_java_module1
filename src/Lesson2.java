public class Lesson2 {
  public static void main(String[] args) {
    System.out.println("Задание 1");
    System.out.println("Тест: a = 1, b = 5");
    System.out.println(isNumberInRange(1, 5));
    System.out.println("");
    System.out.println("Тест: a = 5, b = 6");
    System.out.println(isNumberInRange(5, 6));
    System.out.println("");
    System.out.println("Тест: a = 10, b = 12");
    System.out.println(isNumberInRange(10, 12));
    System.out.println("\n---------------------------\n");

    System.out.println("Задание 2");
    System.out.println("Тест: num = 10");
    checkNumberSign(10);
    System.out.println("");
    System.out.println("Тест: num = -10");
    checkNumberSign(-10);
    System.out.println("\n---------------------------\n");

    System.out.println("Задание 3");
    System.out.println("Тест: num = 78");
    System.out.println(isNegativeNumber(78));
    System.out.println("");
    System.out.println("Тест: num = -64");
    System.out.println(isNegativeNumber(-64));
    System.out.println("\n---------------------------\n");

    System.out.println("Задание 4");
    System.out.println("Тест: count = 5");
    printString("Тестовая строка с положительным количеством выводов", 5);
    System.out.println("");
    System.out.println("Тест: count = -4");
    printString("Тестовая строка с отрицательным количеством выводов", -4);
    System.out.println("\n---------------------------\n");

    System.out.println("Задание 5");
    System.out.println("Тест: year = 4");
    System.out.println(checkLeapYear(4));
    System.out.println("");
    System.out.println("Тест: year = 6");
    System.out.println(checkLeapYear(6));
    System.out.println("");
    System.out.println("Тест: year = 100");
    System.out.println(checkLeapYear(100));
    System.out.println("");
    System.out.println("Тест: year = 400");
    System.out.println(checkLeapYear(400));
    System.out.println("");
    System.out.println("Тест: year = 1600");
    System.out.println(checkLeapYear(1600));
    System.out.println("");
    System.out.println("Тест: year = 1700");
    System.out.println(checkLeapYear(1700));
    System.out.println("");
    System.out.println("\n---------------------------\n");
  }

  private static boolean isNumberInRange(int a, int b) {
    int sum = a + b;
    return sum >=10 && sum <=20;
  }

  private static void checkNumberSign(int num) {
    if(num < 0) {
      System.out.println("Число отрицательное");
    } else {
      System.out.println("Число положительное");
    }
  }

  private static boolean isNegativeNumber(int num) {
    return num < 0;
  }

  private static void printString(String s, int count) {
    if( count < 0 ) {
      count *= -1;
    }

    for (int i = 0; i < count; i++) {
      System.out.println(s);
    }
  }

  private static boolean checkLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    }
    else return year % 4 == 0;
  }
}
