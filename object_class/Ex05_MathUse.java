public class Ex05_MathUse {

  public static void main(String[] args) {
    // 제곱근
    System.out.println(Math.sqrt(9)); // 3.0
    // 2의 3승
    System.out.println(Math.pow(2, 3)); // 8.0
    // 원주율
    System.out.println(Math.PI); // 3.141592653589793
    // 라디안
    double radian45 = Math.toRadians(45);
    // 삼각함수
    System.out.println(Math.sin(radian45)); // 0.7071067811865475
    System.out.println(Math.cos(radian45)); // 0.7071067811865476
    System.out.println(Math.tan(radian45)); // 0.9999999999999999
    // 로그함수
    System.out.println(Math.log(25)); // 3.2188758248682006
  }
}
