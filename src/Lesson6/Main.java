package Lesson6;

public class Main {
  public static void main(String[] args) {
    Cat barsik = new Cat("barsik");
    Cat vasya = new Cat("vasya");
    Cat mursik = new Cat("mursik");

    Dog sharik = new Dog("sharik");
    Dog bobik = new Dog("bobik");

    barsik.swim(10);
    vasya.run(300);
    mursik.run(150);
    System.out.println();

    sharik.run(400);
    sharik.swim(5);
    System.out.println();

    bobik.run(520);
    bobik.swim(15);
    System.out.println();

    System.out.printf("Всего животных: %d\n", Animal.getAnimalsCount());
    System.out.printf("Собак: %d\n", Animal.getDogsCount());
    System.out.printf("Кошек: %d\n", Animal.getCatsCount());
  }
}
