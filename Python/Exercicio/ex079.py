numeros = list()

while True:
    n = int(input('Digite um numero: '))
    if n not in numeros:
        numeros.append(n)
        print('Adicionado com sucesso...')
    else:
        print('Valor duplicado! Não vou adicionar...')

    r = str(input('Quer continuar? [S/N]')).strip()[0]
    if r in 'Nn':
        break

print('=-' * 30)
numeros.sort()
print(f'Voce digitou os valores {numeros}')

