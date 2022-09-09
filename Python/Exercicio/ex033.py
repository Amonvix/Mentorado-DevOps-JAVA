# programa para validação de menores e maiores

n1 = int(input('Entre o primeiro numero: ').strip())
n2 = int(input('Entre o segundo numero: ').strip())
n3 = int(input('Entre o terceiro numero: ').strip())

if n1 > n2 and n1 > n3:
    print('O numero {} é maior e o numero {} é o menor.'.format(n1, (n2 if n2 < n3 else n3)))
elif n2 > n1 and n2 > n3:
    print('O numero {} é maior e o numero {} é o menor.'.format(n2, (n1 if n1 < n3 else n3)))
else:
    print('O numero {} é maior e o numero {} é o menor.'.format(n3, (n2 if n2 < n1 else n1)))

