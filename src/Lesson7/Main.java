package Lesson7;

import java.util.Random;

public class Main {
  static final String[] CAT_NAMES = {"Barsik", "Mursik", "Boris", "Tosik", "Bobik"};
  static Random random = new Random();

  public static void main(String[] args) {
    Plate plate = new Plate(15);
    Cat[] cats = new Cat[CAT_NAMES.length];

    for (int i = 0; i < cats.length; i++) {
      cats[i] = new Cat(CAT_NAMES[i], random.nextInt(10) + 1);
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
