import java.util.Scanner;

public class InsertSort {

  public static void getNumber(int[] num) {
    Scanner sc = new Scanner(System.in);
    System.out.println("10개의 정수를 무작위로 입력하세요.");
    for (int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }
  }

  public static void insertSort(int[] num) {
    int temp = 0;
    int j = 0;
    for (int i = 1; i < num.length; i++) {
      temp = num[i];
      for (j = i - 1; j >= 0 && temp < num[j]; j--) {
        num[j + 1] = num[j];
      }
      num[j + 1] = temp;
    }
  }

  public static void main(String[] args) {
    int[] num = new int[10];

    getNumber(num);
    insertSort(num);

    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
