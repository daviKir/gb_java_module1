package Lesson6;

public class Cat extends Animal {
  public Cat(String name, int maxRunDistance) {
    super(name, maxRunDistance);

    incrementCatsCount();
  }

  @Override
  public void run(int distance) {
    if (distance > this.maxRunDistance) {
      System.out.printf("%s пробежал %dм и присел отдахнуть\n", name, maxRunDistance);
    } else {
      super.run(distance);
    }
  }

  @Override
  public void swim(int distance) {
    System.out.println("Коты не умеют плавать");
  }
}
