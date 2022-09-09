# Desconsiderando os impares

s = 0
count = 0
for c in range(0, 6):
    num = int(input('Digite um valor: '))
    if num % 2 == 0:
        s += num
        count += 1

print('A soma de todos os numeros pares é de {}!'.format(s), end=' ')
print('Foram somados {} numeros pares.'.format(count))
