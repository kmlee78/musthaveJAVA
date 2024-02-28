public class Ex02_Varargs {

  public static void hello(String... names) {
    for (String name : names) {
      System.out.print(name + " ");
    }
  }

  public static void main(String[] args) {
    hello("Alice", "Bob", "Charlie"); // Alice Bob Charlie
    System.out.println();
    hello("Dave", "Eve"); // Dave Eve
  }
}
