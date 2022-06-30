from fizzbuzz import fizzbuzz_game


def test_fizzbuzz():
    actual = [fizzbuzz_game(x) for x in range(1, 21)]
    expected = [
        1,
        2,
        "fizz",
        4,
        "buzz",
        "fizz",
        7,
        8,
        "fizz",
        "buzz",
        11,
        "fizz",
        13,
        14,
        "fizzbuzz",
        16,
        17,
        "fizz",
        19,
        "buzz",
    ]
    assert actual == expected
