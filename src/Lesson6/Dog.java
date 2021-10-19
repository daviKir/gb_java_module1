package Lesson6;

public class Dog extends Animal {
  public Dog(String name) {
    super(name);

    setDogsCount();
  }

  @Override
  public void run(int distance) {
    if (distance > 500) {
      System.out.printf("%s пробежал 500м и присел отдахнуть\n", name);
    } else {
      super.run(distance);
    }
  }

  @Override
  public void swim(int distance) {
    if (distance > 10) {
      System.out.printf("%s проплыл 10м, устал и утонул\n", name);
    } else {
      super.swim(distance);
    }
  }
}
