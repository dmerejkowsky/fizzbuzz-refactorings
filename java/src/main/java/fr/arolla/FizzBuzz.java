package fr.arolla;


public class FizzBuzz {
  public static String fizzBuzz(int number) {
    boolean divisibleBy3 = number % 3 == 0;
    boolean divisibleBy5 = number % 5 == 0;
    // Note: keep this test first
    if (divisibleBy3 && divisibleBy5) {
      return "fizzbuzz";
    }
    if (divisibleBy3) {
      return "fizz";
    }
    if (divisibleBy5) {
      return "buzz";
    }

    return Integer.toString(number);
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      String res = fizzBuzz(i);
      System.out.format("%d -> %s\n", i, res);
    }
  }
}
