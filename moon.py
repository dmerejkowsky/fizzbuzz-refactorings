def is_full_moon() :
    return True


def main():
    if   is_full_moon():
        mesage = "Attention aux loug-garous"
    else:
        message="Promenons-nous dans les bois"
    print( message  )
