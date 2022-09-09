n = int(input('Digite um valor pra calcular o fatorial: '))
f = 1
c = n
print('Calculando {}!'.format(n))
while c > 0:
    print('{}' .format(c), end='')
    print(' X ' if c > 1 else ' = ', end='')
    f *= c
    c -= 1
print('{}.'.format(f))