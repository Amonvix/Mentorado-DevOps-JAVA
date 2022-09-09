from math import trunc

num = float(input('Digite um numero com virgula!: '))
print('O numero {} tem a parte inteira {}.'.format(num, trunc(num)))  # math.trunc para cortar o numero antes da virgula.
