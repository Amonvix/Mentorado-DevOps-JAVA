# Minha solução resolve o proplema mas não utilizando as metricas do problema

lista = []

for c in range(0,7):
    lista.append(int(input(f'Digite o {c + 1}° valor: ')))
lista.sort()
print('-=' * 50)
print('O valores pares digitados são: ', end='')
for c in lista:
    if c % 2 == 0:
        print(f'{c},', end='')
print()
print('O valores impares digitados são: ', end='')
for c in lista:
    if c % 2 != 0:
        print(f'{c},', end='')
