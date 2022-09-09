from time import sleep

num = int(input('Digite um numero inteiro para conversão:'))
print('''Escolha uma das bases de conversão abaixo:
[ 1 ] Converter para BINÁRIO
[ 2 ] Converter para OCTAL
[ 3 ] Converter para HEXADECIMAL''')

opcao = int(input('Sua opção : '))

print('PROCESSANDO...')
sleep(2)
if opcao == 1:
    print('O resultado da conversão de {} para BINÁRIO é {}.'.format(num, bin(num)[2:]))

elif opcao == 2:
    print('O resultado da conversão de {} para OCTAL é {}.'.format(num, oct(num)[2:]))

elif opcao == 3:
    print('O resultado da conversão de {} para HEXADECIMAL é {}.'.format(num, hex(num)[2:]))

else:
    print('OPÇÃO INVÁLIDA!')
