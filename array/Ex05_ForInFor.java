public class ForInFor {

  public static void main(String[] args) {
    // 다차원 배열 정의
    int[][] arr1 = new int[2][3]; // 2행 3열의 2차원 배열

    // 다차원 배열 생성과 동시에 초기화
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " "); // 1 2 3 4 5 6 7 8 9
      }
    }
  }
}
