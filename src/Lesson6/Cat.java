package Lesson6;

public class Cat extends Animal {
  public Cat(String name) {
    super(name);

    setCatsCount();
  }

  @Override
  public void run(int distance) {
    if (distance > 200) {
      System.out.printf("%s пробежал 200м и присел отдахнуть\n", name);
    } else {
      super.run(distance);
    }
  }

  @Override
  public void swim(int distance) {
    System.out.println("Коты не умеют плавать");
  }
}
