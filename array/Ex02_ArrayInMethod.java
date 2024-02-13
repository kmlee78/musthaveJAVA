public class Ex02_ArrayInMethod {

  public static void main(String[] args) {
    int[] arr1 = makeArray(3); // 길이가 3인 int형 1차원 배열
    int sum = sumOfArray(arr1); // 배열을 매개변수로 전달
    System.out.println(sum); // 3
  }

  public static int[] makeArray(int size) { // 반환형이 배열인 메서드
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = i;
    }
    return arr;
  }

  public static int sumOfArray(int[] arr) { // 배열을 매개변수로 받는 메서드
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
}
