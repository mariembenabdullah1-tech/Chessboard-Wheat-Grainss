public class FibonacciNumbers
{
  public static void main(String[] args)
  {

    int first = 1;
    int second = 1;

    for (int i = 0; i < 20; i++) {

      System.out.println("Fibonacci(" + i + ") = " + first);

      int next = first + second;

      first = second;
      second = next;
    }
  }
}

