# Valor comparativo

print('*' * 50)
n1 = int(input('Digite um numero: ').strip())
n2 = int(input('Digite outro numero: ').strip())

if n1 < n2:
    print('{}O Segundo valor{} é o maior!'.format('\033[1;31m', '\033[m'))

elif n1 == n2:
    print('{}Não existe valor maior{}, os dois são iguais!'.format('\033[1;31m', '\033[m'))

else:
    print('{}O Primeiro valor{} é o maior.'.format('\033[1;31m', '\033[m'))
