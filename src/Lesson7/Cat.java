package Lesson7;

public class Cat {
  private final String name;
  private int appetite;

  public Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
  }

  public String getName() {
    return name;
  }

  public boolean isFull() {
    return appetite == 0;
  }

  public void eat(Plate plate) {
    System.out.printf("%s ест\n", name);
    int foodLeft = plate.getFood();
    if (foodLeft < appetite) {
      appetite -= foodLeft;
      System.out.printf("%s не наелся, нужно еще %d еды\n", name, appetite);
    }
    plate.decreaseFood(appetite);
  }

  public void info() {
    System.out.printf("Кот: %s, аппетит: %d\n", name, appetite);
  }
}
