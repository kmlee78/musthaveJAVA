class Cat {

  static int a = 5;
  int num = 3;

  void printValue(int num) {
    this.num = num;
    System.out.println("a = " + a);
    System.out.println("num = " + this.num);
  }
}

public class Ex01_GlobalVariable {

  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.num = 1;
    cat1.a = 10; // static 변수에 직접 접근
    cat.printValue(10); // a = 10, num = 10

    Cat cat2 = new Cat();
    cat2.num = 2;
    cat2.a = 11; // static 변수에 직접 접근
    cat2.printValue(20); // a = 11, num = 20

    // cat2의 a를 변경했지만 cat1의 a도 변경됨. static 변수이기 때문
    System.out.println(cat1.a); // 11
  }
}
