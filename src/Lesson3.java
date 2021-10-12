import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
  public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
  }

  private static void task1() {
    System.out.println("Задание 1");
    System.out.println("Тест: array = [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]");

    int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] == 0 ? 1 : 0;
    }

    System.out.println(Arrays.toString(array));
    System.out.println();
  }

  private static void task2() {
    System.out.println("Задание 2");
    System.out.println("Тест: пустой массив на 100 элементов");

    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }

    System.out.println(Arrays.toString(array));
    System.out.println();
  }

  private static void task3() {
    System.out.println("Задание 3");
    System.out.println("Тест: array = [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]");

    int[] task3Array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < task3Array.length; i++) {
      if (task3Array[i] < 6) {
        task3Array[i] = task3Array[i] * 2;
      }
    }

    System.out.println(Arrays.toString(task3Array));
    System.out.println();
  }

  private static void task4() {
    System.out.println("Задание 4");
    System.out.println("Введите размер квадратной матрицы:");

    Scanner scanner = new Scanner(System.in);
    int matrixSize = scanner.nextInt();

    int[][] matrix = new int[matrixSize][matrixSize];

    for (int row = 0; row < matrixSize; row++) {
      for (int col = 0; col < matrixSize; col++) {
        if(row == col || col == matrixSize - 1 - row) {
          matrix[row][col] = 1;
        }
        System.out.print(matrix[row][col] + "  ");
      }
      System.out.println();
    }
    System.out.println();
  }

  private static void task5() {
    System.out.println("Задание 5");
    System.out.println("Введите длинну массива:");
    Scanner scanner = new Scanner(System.in);
    int arrayLength = scanner.nextInt();
    System.out.println("Каким числом заполнить?");
    int initialValue = scanner.nextInt();
    System.out.println("Воспользоваться встроенной утилитой - 1\nСвоей - 2");

    boolean withStandardUtils = scanner.nextInt() == 1;
    int[] filledArr = createFilledArray(arrayLength, initialValue, withStandardUtils);
    System.out.println(Arrays.toString(filledArr));

    System.out.println();
  }

  private static int[] createFilledArray(int len, int initialValue, boolean withStandardUtils) {
    int[] filledArray = new int[len];
    if (withStandardUtils) {
      Arrays.fill(filledArray, initialValue);
    } else {
      for (int i = 0; i < filledArray.length; i++) {
        filledArray[i] = initialValue;
      }
    }
    return filledArray;
  }

  private static void task6() {
    System.out.println("Задание 6");
    System.out.println("Тест: array = [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]");

    int[] array = { 8, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
    int max = array[0];
    int min = array[0];
    for (int item : array) {
      if (item > max) {
        max = item;
      }
      if (item < min) {
        min = item;
      }
    }

    System.out.printf("min: %s, max: %s\n", min, max);
    System.out.println();
  }

  private static void task7() {
    System.out.println("Задание 7");
    System.out.println("Тест: array = [ 2, 2, 2, 1, 2, 2, 10, 1 ]");
    System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
    System.out.println("Тест: array = [ 2, 5, 5, 1, 11, 8, 10, 1 ]");
    System.out.println(checkBalance(new int[] {2, 5, 5, 1, 11, 8, 10, 1}));
    System.out.println();
  }

  private static boolean checkBalance(int[] arr) {
    if(arr.length <= 1) {
      return false;
    }

    int itemsLeft = arr.length;
    int leftCurIndex = 0;
    int rightCurIndex = arr.length - 1;
    int leftSum = 0;
    int rightSum = 0;

    while (true) {
      if (itemsLeft > 1) {
        if (leftSum > rightSum) {
          rightSum += arr[rightCurIndex];
          rightCurIndex--;
          itemsLeft--;
        } else if (leftSum < rightSum) {
          leftSum += arr[leftCurIndex];
          leftCurIndex++;
          itemsLeft--;
        } else {
          rightSum += arr[rightCurIndex];
          rightCurIndex--;
          leftSum += arr[leftCurIndex];
          leftCurIndex++;
          itemsLeft -= 2;
        }
      } else if(itemsLeft == 1) {
        int leftTemp = leftSum + arr[leftCurIndex];
        int rightTemp = rightSum + arr[rightCurIndex];
        return leftTemp == rightSum || rightTemp == leftSum;
      } else if (itemsLeft == 0) {
        return rightSum == leftSum;
      }
    }
  }

  private static void task8() {
    System.out.println("Задание 8");
    System.out.println("Тест: array = [ 3, 5, 6, 1 ]");
    int[] testArray1 = {3, 5, 6, 1};
    shiftArray(testArray1, -2);
    System.out.println("Тест: array = [ 3, 5, 6, 1, 4, 8 ]");
    int[] testArray2 = {3, 5, 6, 1, 4, 8};
    shiftArray(testArray2, 3);
    System.out.println();
  }

  /**
  * ! Мутабельный метод !
  * */
  private static void shiftArray(int [] arr, int n) {
    if (n < 0) {
      for (int i = n; i < 0; i++) {
        int element = arr[0];
        for (int j = 0; j < arr.length; j++) {
          arr[j] = j == arr.length - 1 ? element : arr[j+1];
        }
      }
    } else {
      for (int i = 0; i < n; i++) {
        int element = arr[arr.length - 1];
        for (int j = arr.length - 1 ; j >= 0; j--) {
          arr[j] = j == 0 ? element : arr[j-1];
        }
      }
    }
  }
}
