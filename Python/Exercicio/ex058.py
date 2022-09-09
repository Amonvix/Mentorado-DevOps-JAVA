from random import randint

print('Brincando de adivinhar!')

contador = 1
jogador = int(input('Escolha um numero entre 1 e 10: ').strip())
computador = randint(1, 10)
while computador != jogador:
    contador += 1
    print('{}... Não foi dessa vez!'.format('Mais' if jogador < computador else 'Menos'), end=' ')
    jogador = int(input('Escolha novamente um numero entre 1 e 10:'))
    if jogador >= 10:
        print('Numero invalido. Tente novamente.', end=' ')
        print('Esta jogada não contou!.')
        jogador = int(input('Escolha novamente um numero entre 1 e 10:'))
print('ACERTOU!!!', end='')
print('Foram necessárias {} tentativas até adivinhar o numero do computador.'.format(contador))