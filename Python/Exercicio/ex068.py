from random import randint
# LOOP PAR OU IMPAR

print('-=' * 30)
print("{:^55}".format('Vamos jogar par ou impar'))
print('-=' * 30)

resposta = ''
jogador = ""
soma = 0
res = ''
c = 0
while res == resposta:
    computador = randint(0, 10)
    jogador = int(input('Digite um valor: '))
    resposta = str(input('Par ou Ímpar?: [P/I]')).strip().upper()[0]
    while resposta not in "P, I":
        resposta = str(input('Par ou Ímpar?: [P/I]')).strip().upper()[0]
    c += 1
    soma = (jogador + computador)
    div = soma % 2
    if div == 0:
        res = "P"
    else:
        res = 'I'
    print('Voce jogou {} e o computador {}. Total deu {} {}'.format(jogador, computador, soma, 'PAR' if res in "P" else "IMPAR"))
    print('Voce ganhou {} vezes'.format(c - 1))
    print('-=-' * 30)
    print('VOCE {}'.format('GANHOU. Vamos de novo' if res == resposta else "PERDEU. Tente novamente"))
    print('-=-' * 30)
else:
    print('Terminou')


