package fr.arolla;


public class FizzBuzz {
  /**
   * Implements the fizzbuzz game
   *
   * @param x the number
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
  public static String fizzBuzzGame(int x) {
    String result;
    if (x % 3 == 0 && x % 5 == 0) {
      result = "fizzbuzz";
    } else if (x % 3 == 0) {
      result = "fizz";
    } else if (x % 5 == 0) {
      result = "buzz";
    } else {
      result = Integer.toString(x);
    }

    return result;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      String res = fizzBuzzGame(i);
      System.out.format("%d -> %s\n", i, res);
    }
  }
}
