matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
par = soma = maior = 0

for l in range(0, 3):
    for c in range(0, 3):
        matriz[l][c] = int(input(f'Digite o numero da posição {l},{c}: '))
        if matriz[l][c] % 2 == 0:
            par += matriz[l][c]
        if matriz[l][2]:
            soma += matriz[l][2]
        if matriz[1][c] > maior:
            maior = matriz[1][c]

print('-=' * 30)
for l in range(0, 3):
    for c in range(0, 3):
        print(f'[{matriz[l][c]:^5}]', end='')
    print()
print('-=' * 30)
print(f'A soma dos numeros pares é {par}')
print(f'A soma da terceira coluna é {soma}.')
print(f'O maior valor da segunda linha é: {maior}.')
