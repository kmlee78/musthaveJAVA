abstract class Animal {

  abstract void sound();
}

class Dog extends Animal {

  void sound() {
    System.out.println("멍멍");
  }
}

class Cat extends Animal {

  void sound() {
    System.out.println("야옹");
  }
}

public class Ex06_Polymorphism3 {

  // 매개변수로 어떤 객체가 들어올지 모르기 때문에 상위 클래스 타입으로 선언
  public static Animal animalChoose(Animal obj) {
    if (obj instanceof Dog) { // 객체가 지정한 클래스형의 객체인지 확인
      Dog d = (Dog) obj; // 형변환
      d.sound();
    } else {
      Cat c = (Cat) obj;
      c.sound();
    }
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    animalChoose(dog); // 멍멍

    Cat cat = new Cat();
    animalChoose(cat); // 야옹
  }
}
