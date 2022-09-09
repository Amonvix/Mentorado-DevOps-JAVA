lista = list()
dado = list()
r = 'S'
maior = menor = 0
while True:
    while r in 'Ss':
        dado.append(str(input('Nome: ')).title())
        dado.append(float(input('Peso: ')))
        lista.append(dado[:])
        dado.clear()
        r = str(input('Deseja continuar? [S/N]')).strip().upper()[0]
    else:
        break

for d in lista:
    if d[1] >= 100:
        print(f'{d[0]} é uma pessoa pesada com {d[1]} kilos ')

    elif d[1] <= 80:
        print(f'{d[0]} é uma pessoa leve com {d[1]} kilos.')

print(f'Foram digitados dados de {len(lista)} pessoas')