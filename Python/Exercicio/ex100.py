from random import randint
from time import sleep
sort = []


def sorteio(lista):
    print('Sorteando 5 valores para a Lista: ', end='')
    for i in range(0, 5):
        sort.append(randint(1, 10))
    for n in sort:
        print(n, end=' ')
        sleep(.5)
    print('Pronto!')


def pares(lista):
    par = 0
    for i in lista:
        if i % 2 == 0:
            par += i
    print(f'Somando os valores pares de {sort}, temos {par}.')


sorteio(sort)
pares(sort)

