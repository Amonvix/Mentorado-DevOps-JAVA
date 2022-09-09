# par ou impar

num = int(input('Digite um numero inteiro: ').strip())
par = num % 2

if par == 0:
    print('O numero {} é par'.format(num))

else:
    print('O numero {} é impar.'.format(num))