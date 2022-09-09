print("=-" * 5, '{:^10}'.format('NÚMEROS PRIMOS'), '=-' * 5)
print()
print()

num = int(input('Qual numero vamos descobrir se é primo? : '))

for calculo in range(2, num):
    if (num % calculo) == 0:
        print('O numero {}, não é um numero PRIMO'.format(num))
        break
else:
    print('O numero {} é PRIMO'.format(num))
