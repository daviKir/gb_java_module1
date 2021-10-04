public class Lesson1 {
  public static void main(String[] args) {
    System.out.println("Task 1");
    printThreeWords();
    System.out.println("Task 2");
    checkSumSign();
    System.out.println("Task 3");
    printColor();
    System.out.println("Task 4");
    compareNumbers();
  }

  public static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
    System.out.println("");
  }

  public static void checkSumSign() {
    int a = -13;
    int b = 21;
    int sum = a + b;

    if(sum >= 0) {
      System.out.println("The amount is positive");
    } else {
      System.out.println("The amount is negative");
    }
    System.out.println("");
  }

  public static void printColor() {
    int value = 23;

    if(value <= 0) {
      System.out.println("red");
    } else if(value > 0 && value <= 100) {
      System.out.println("yellow");
    } else {
      System.out.println("green");
    }
    System.out.println("");
  }

  public static void compareNumbers() {
    int a = -13;
    int b = 21;

    if(a >= b) {
      System.out.println("a >= b");
    } else {
      System.out.println("a < b");
    }
  }
}
