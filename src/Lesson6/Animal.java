package Lesson6;

public abstract class Animal {
  private static int animalsCount = 0;
  private static int catsCount = 0;
  private static int dogsCount = 0;

  protected final String name;
  protected final int maxRunDistance;
  protected final int maxSwimDistance;


  public Animal(String name, int maxRunDistance, int maxSwimDistance) {
    this.name = name;
    this.maxRunDistance = maxRunDistance;
    this.maxSwimDistance = maxSwimDistance;

    animalsCount++;
  }

  public Animal(String name, int maxRunDistance) {
    this(name, maxRunDistance, 0);
  }

  protected void incrementCatsCount() {
    catsCount++;
  }

  protected void incrementDogsCount() {
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
