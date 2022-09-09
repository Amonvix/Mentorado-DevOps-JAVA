jogador = dict()
gols = list()
time = list()
while True:
    jogador.clear()
    jogador['nome'] = str(input('Player: ')).strip().upper()
    partidas = int(input(f'Quantas partidas {jogador["nome"]} jogou? '))
    for c in range(1, partidas + 1):
        gols.append(int(input(f'  Quantos gols foram feitos na partida {c}? ')))
    jogador['gols'] = gols[:]
    jogador['total'] = sum(gols)
    gols.clear()
    time.append(jogador.copy())
    while True:
        resp = str(input('Quer continuar? [S/N] ')).upper()[0]
        if resp in "SN":
            break
        print('Erro! Por favor, digite apenas "S" ou "N".')
    if resp == "N":
        break
print('-=' * 30)
# inicio
print('cod ', end='')
for i in jogador.keys():
    print(f'{i:<15}', end='')
print()
print('-' * 50)
for k, v in enumerate(time):
    print(f'{k:>2}  ', end='')
    for d in v.values():
        print(f'{str(d):<15}', end='')
    print()
print('-' * 40)
while True:
    busca = int(input('Mostrar dados de qual jogador? (999 para encerrar) '))
    if busca == 999:
        break
    if busca >= len(time):
        print('Erro! Player não encontrado')
    else:
        print(f' -- LEVANTAMENTO DO JOGADOR {time[busca]["nome"]}')
        for i, g in enumerate(time[busca]['gols']):
            print(f'   No jogo {i + 1} fez {g} gols')
print('-' * 40)
print('<<VOLTE SEMPRE>>')


print()
print('-=' * 30)
print(f'Player {jogador["nome"]} jogou {len(jogador["gols"])} partidas.')
for i, v in enumerate(gols):
    print(f'  => Na partida {i +1}, {jogador["nome"]} fez {v} gols.')
print(f'Foi um total de {jogador["total"]} GOLS! ')
