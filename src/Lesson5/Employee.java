package Lesson5;

public class Employee {
  private String fullName;
  private String position;
  private String eMail;
  private String phone;
  private int salary;
  private int age;

  public Employee(String fullName, String position, String eMail, String phone, int salary, int age) {
    this.fullName = fullName;
    this.position = position;
    this.eMail = eMail;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
  }

  public String getFullName() {
    return fullName;
  }

  public String getPosition() {
    return position;
  }

  public String getEMail() {
    return eMail;
  }

  public String getPhone() {
    return phone;
  }

  public int getSalary() {
    return salary;
  }

  public int getAge() {
    return age;
  }

  public void printInfo() {
    System.out.printf("ФИО: %s\nДолжность: %s\nE-mail: %s\nТелефон: %s\nЗарплата: %d\nВозраст: %d\n", fullName, position, eMail, phone, salary, age);
  }
}
