jogador = dict()
gols = list()
totgol = 0
jogador['nome'] = str(input('Player: ')).strip().upper()
partidas= int(input(f'Quantas partidas {jogador["nome"]} jogou? '))
for c in range(1, partidas + 1):
    gol = int(input(f'  Quantos gols foram feitos na partida {c}? '))
    totgol += gol
    gols.append(gol)
    jogador['gols'] = gols[:]
jogador['total'] = totgol
print('-=' * 30)
print(jogador)
print('-=' * 30)
for k,v in jogador.items():
    print(f'O campo {k} tem o valor {v}')
print('-=' * 30)
print(f'Player {jogador["nome"]} jogou {len(jogador["gols"])} partidas.')
for i, v in enumerate(gols):
    print(f'  => Na partida {i +1}, {jogador["nome"]} fez {v} gols.')
print(f'Foi um total de {totgol} GOLS! ')

