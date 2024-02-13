class Box {

  public String name;

  Box(String name) {
    this.name = name;
  }
}

public class Ex01_ArrayInstance {

  public static void main(String[] args) {
    int[] arr1 = new int[3]; // 길이가 3인 int형 1차원 배열
    // 배열에 값 저장
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;

    String[] arr2 = new String[3]; // 길이가 3인 String형 1차원 배열
    arr2[0] = new String("홍길동");
    arr2[1] = new String("이순신");
    arr2[2] = new String("세종대왕");

    Box[] arr3 = new Box[3]; // 길이가 3인 Box형 1차원 배열
    arr3[0] = new Box("홍길동");
    arr3[1] = new Box("이순신");
    arr3[2] = new Box("세종대왕");

    // 배열의 객체 변수 접근
    System.out.println(arr1.length); // 3
    System.out.println(arr2.length); // 3
  }
}
