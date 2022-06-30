def fizzbuzz_game(x):
    """Implements the fizzbuzz game

    if number is divisible by 3:
        return "fizz"
    if number is divisible by 5:
        return "buzz"
    if number is divisible by 15:
        return "fizzbuzz"
    in all other cases return the number
    unchanged

    """
    if (x % 3 == 0) and (x % 5 == 0):
        result = "fizzbuzz"
    elif x % 3 == 0:
        result = "fizz"
    elif x % 5 == 0:
        result = "buzz"
    else:
        result = x
    return result
