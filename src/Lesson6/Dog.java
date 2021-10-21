package Lesson6;

public class Dog extends Animal {
  public Dog(String name, int maxRunDistance, int maxSwimDistance) {
    super(name, maxRunDistance, maxSwimDistance);

    incrementDogsCount();
  }

  @Override
  public void run(int distance) {
    if (distance > maxRunDistance) {
      System.out.printf("%s пробежал %dм и присел отдахнуть\n", name, maxRunDistance);
    } else {
      super.run(distance);
    }
  }

  @Override
  public void swim(int distance) {
    if (distance > maxSwimDistance) {
      System.out.printf("%s проплыл %dм, устал и утонул\n", name, maxSwimDistance);
    } else {
      super.swim(distance);
    }
  }
}
