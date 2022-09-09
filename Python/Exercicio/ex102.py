def fatorial(num=1, show=False):
    """
    -> Calcula o Fatorial de um numero
    :param num: O numero a ser calculado
    :param show: (opcional) True para mostrar a conta
    :return: O valor do Fatorial de um numero n
    """
    from time import sleep
    f = 1
    for c in range(num, 0, -1):
        if show:
            print(c, end='')
            if c > 1:
                print(' x ', end='')
            else:
                print(' = ', end='')
            sleep(.2)
        f *= c

    return f


print(fatorial(10, True))
# help(fatorial)