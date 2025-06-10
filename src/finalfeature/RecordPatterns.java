package finalfeature;

import java.util.ArrayList;

public class RecordPatterns {

  record Car(String make, String model) {}
  record Person(String firstName, String lastName, Car car) {}

  void main(String[] args) {
    Car car1 = new Car("Audi", "A4");
    // Nested record
    Person person1 = new Person("John", "Smith", car1);

    ArrayList list = new ArrayList();
    list.add(person1);

    // before Java 21
    if (list.get(0) instanceof Person) {
      Person person = (Person) list.get(0);
      System.out.println(person.firstName + " " + person.lastName + " " + person.car.make + " " + person.car.model);
    }

    // using deconstructor and vars
    if (list.get(0) instanceof Person(var first, var last, Car(var make, var model) )) {
      System.out.println(first + " " + last + " " + make + " " + model);
    }

    // using switch
    switch (list.get(0)) {
      case Person(var first, var last, Car(var make, var model)) -> {
        System.out.println(first + " " + last + " " + make + " " + model);
      }
      default -> throw new IllegalStateException("Unexpected value: " + list.get(0));
    }
  }

}
