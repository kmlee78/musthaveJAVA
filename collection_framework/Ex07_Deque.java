// 자바에서는 스택을 Deque를 이용하여 구현할 수 있다.
import java.util.ArrayDeque;
import java.util.Deque;

public class Ex07_Deque {

  public static void main(String[] args) {
    Deque<String> deq = new ArrayDeque<>();
    // Deque<String> deq = new LinkedList<>(); // LinkedList로도 가능하다.

    // 앞에서 넣기
    deq.offerFirst("A");
    deq.offerFirst("B");
    deq.offerFirst("C");

    // 앞에서 꺼내기
    System.out.println(deq.pollFirst()); // C
    System.out.println(deq.pollFirst()); // B
    System.out.println(deq.pollFirst()); // A

    // 뒤에서 넣기
    deq.offerLast("A");
    deq.offerLast("B");
    deq.offerLast("C");

    // 뒤에서 꺼내기
    System.out.println(deq.pollLast()); // C
    System.out.println(deq.pollLast()); // B
    System.out.println(deq.pollLast()); // A

    // 뒤에서 넣기
    deq.offerLast("A");
    deq.offerLast("B");
    deq.offerLast("C");

    // 앞에서 꺼내기
    System.out.println(deq.pollFirst()); // A
    System.out.println(deq.pollFirst()); // B
    System.out.println(deq.pollFirst()); // C
  }
}
