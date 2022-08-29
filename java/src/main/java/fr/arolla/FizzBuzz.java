package fr.arolla;


public class FizzBuzz {
  /**
   * Implements the fizzbuzz game
   *
   * @param number the number
   * @return the output
   * if number is divisible by 3:
   * return "fizz"
   * if number is divisible by 5:
   * return "buzz"
   * if number is divisible by 15:
   * return "fizzbuzz"
   * else
   * return the number a string
   */
  public static String fizzBuzz(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "fizzbuzz";
    } else if (number % 3 == 0) {
      return "fizz";
    } else if (number % 5 == 0) {
      return "buzz";
    } else {
      return Integer.toString(number);
    }
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      String res = fizzBuzz(i);
      System.out.format("%d -> %s\n", i, res);
    }
  }
}
