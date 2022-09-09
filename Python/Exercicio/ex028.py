import random

n1 = int(input('Digite um numero inteiro entre "0" e "5". :').strip())
n2 = random.randint(0, 5) # comando para gerar um numero entre (x, y)

if n2 == n1:
    print('P A R A B É N S -- VOCE ACERTOU!!! --')

else:
    print('Resposta errada, tente novamente! :( ')
print('O numero sorteado foi {}'.format(n2))
