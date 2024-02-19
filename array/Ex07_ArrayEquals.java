import java.util.Arrays;

public class Ex07_ArrayEquals {

  public static void main(String[] args) {
    // Arrays의 equals()메소드를 사용하여 배열 비교
    int[] arr1 = { 10, 20, 30, 40, 50 };
    int[] arr2 = { 10, 20, 30, 40, 50 };

    System.out.println(Arrays.equals(arr1, arr2)); // true
  }
}
