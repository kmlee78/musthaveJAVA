import java.util.Arrays;

public class ArrayCopy {

  public static void main(String[] args) {
    // Arrays의 copyOf()와 copyOfRange()메소드를 사용하여 배열 복사
    int[] arr1 = { 10, 20, 30, 40, 50 };
    int[] arr2 = { 1, 2, 3, 4, 5 };
    int[] arr3 = Arrays.copyOf(arr1, 3); // arr1의 0번째부터 3 길이만큼 복사
    int[] arr4 = Arrays.copyOfRange(arr2, 1, 3); // arr2의 1번째부터 3번째 인덱스 이전까지 복사

    for (int i : arr3) {
      System.out.print(i + " "); // 10 20 30
    }
    for (int i : arr4) {
      System.out.print(i + " "); // 2 3
    }
  }
}
