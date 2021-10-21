package Lesson7;

import java.util.Random;

public class Main {
  static final String[] catsName = {"Barsik", "Mursik", "Boris", "Tosik", "Bobik"};
  static Random random = new Random();

  public static void main(String[] args) {
    Plate plate = new Plate(15);
    Cat[] cats = new Cat[catsName.length];

    for (int i = 0; i < cats.length; i++) {
      cats[i] = new Cat(catsName[i], random.nextInt(10) + 1);
      System.out.print("Родился ");
      cats[i].info();
    }

    for (Cat cat : cats) {
      plate.info();
      cat.eat(plate);
      if (cat.isFull()) {
        System.out.printf("%s сыт\n", cat.getName());
      }
    }

    System.out.println("добавляем еще немного еды в тарелку");
    plate.addFood(10);
    plate.info();
  }
}
