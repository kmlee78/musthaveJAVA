import java.util.Arrays;

public class Ex08_ArraySort {

  public static void main(String[] args) {
    // Arrays의 sort()메소드를 사용하여 배열 정렬
    int[] arr = { 1, 3, 2, 4 };
    Arrays.sort(arr);
    for (int i : arr) {
      System.out.print(i + " "); // 1 2 3 4
    }
  }
}
