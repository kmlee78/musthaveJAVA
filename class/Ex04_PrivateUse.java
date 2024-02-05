class Student1 {

  String name;
  int age;
}

class Student2 {

  public String name;
  private int age; // private 접근 제한자

  public Student2(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() { // 게터
    return age;
  }

  public void setAge(int age) { // 세터
    this.age = age; // this 키워드로 멤버 변수와 매개변수 구분
  }
}

public class PrivateUse {

  public static void main(String[] args) {
    Student1 student1 = new Student1();
    student1.name = "홍길동"; // 멤버 변수에 직접 접근
    student1.age = 20; // 멤버 변수에 직접 접근

    Student2 student2 = new Student2("홍길동", 20);
    student2.setAge(21); // 메서드를 통한 접근
    System.out.println(student2.getAge()); // 메서드를 통한 접근
  }
}
