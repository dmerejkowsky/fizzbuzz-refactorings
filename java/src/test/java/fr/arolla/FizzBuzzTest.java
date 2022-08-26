package fr.arolla;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testGame() {

        List<String> expected = List.of(
                "1",
                "2",
                "fizz",
                "4",
                "buzz",
                "fizz",
                "7",
                "8",
                "fizz",
                "buzz",
                "11",
                "fizz",
                "13",
                "14",
                "fizzbuzz",
                "16",
                "17",
                "fizz",
                "19",
                "buzz"
        );
        List<String> actual = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            String res = FizzBuzz.fizzBuzzGame(i);
            actual.add(res);
        }
        assertEquals(expected, actual);

    }
}
