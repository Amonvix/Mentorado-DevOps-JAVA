numeros = (int(input('Digite um numero: ')),
           int(input('Digite mais um numero: ')),
           int(input('Digite um terceiro numero: ')),
           int(input('Agora digite o ultimo numero: ')))

print(f'O numero 9 apareceu {numeros.count(9)} vezes!')
if 3 in numeros:
    print(f'O valor 3 foi o {numeros.index(3)+1}°')
else:
    print("o valor 3 não foi digitado")
print('São pares os numeros', end=' ')
for n in numeros:
    if n % 2 == 0:
        print(n, end=' ')

print('Terminou')
