package Lesson6;

public abstract class Animal {
  protected final String name;
  private static int animalsCount = 0;
  private static int catsCount = 0;
  private static int dogsCount = 0;

  public Animal(String name) {
    this.name = name;

    animalsCount++;
  }

  protected void setCatsCount() {
    catsCount++;
  }

  protected void setDogsCount() {
    dogsCount++;
  }

  public static int getAnimalsCount() {
    return animalsCount;
  }

  public static int getCatsCount() {
    return catsCount;
  }

  public static int getDogsCount() {
    return dogsCount;
  }

  public void run(int distance) {
    System.out.printf("%s пробежал %d м\n", this.name, distance);
  }

  public void swim(int distance) {
    System.out.printf("%s проплыл %d м\n", this.name, distance);
  }

}
