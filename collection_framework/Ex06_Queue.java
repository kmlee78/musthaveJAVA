// LinkedList<E> 는 List<E>와 동시에 Queue<E> 인터페이스를 구현한 클래스이다.
import java.util.LinkedList;
import java.util.Queue;

public class Ex06_Queue {

  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("A"); // 큐에 요소를 추가한다.
    queue.offer("B");
    queue.offer("C");
    System.out.println(queue.size()); // 3

    // 다음에 무엇이 나올지 확인한다.
    System.out.println(queue.peek()); // A

    // 큐에서 요소를 꺼낸다.
    System.out.println(queue.poll()); // A
    System.out.println(queue.size()); // 2
    System.out.println(queue.poll()); // B
  }
}
