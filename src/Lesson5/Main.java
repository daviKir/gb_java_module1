package Lesson5;

public class Main {
  public static void main(String[] args) {
    Employee[] employees = new Employee[5];
    employees[0] = new Employee("Leanne Graham", "Sailor", "Sincere@april.biz", "+7(770)736-80-31", 40000, 19);
    employees[1] = new Employee("Ervin Howell", "Archivist", "Shanna@melissa.tv", "+7(010)692-65-93", 50000, 59);
    employees[2] = new Employee("Clementine Bauch", "Logistics Manager", "Nathan@yesenia.net", "+7(463)123-44-47", 55000, 25);
    employees[3] = new Employee("Patricia Lebsack", "Business trainer", "Julianne.OConner@kory.org", "+7(493)170-96-23", 80000, 46);
    employees[4] = new Employee("Chelsey Dietrich", "Design engineer", "Lucio_Hettinger@annie.ca", "+7(254)954-12-89", 120000, 28);

    for (Employee employee : employees) {
      if(employee.getAge() > 40) {
        employee.printInfo();
        System.out.println();
      }
    }
  }
}
