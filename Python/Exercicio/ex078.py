valores = list()

for c in range(0,5):
    valores.append(int(input(f'Digite um valor na posição {c}: ')))

print(f'Voce digitou os valores: {valores}')
for c, item in enumerate(valores):
    if item == min(valores):
        print(f'O menor valor é {item}, e esta na posição(ões)', end='')
        print(f'{c + 1}°... ')

    if item == max(valores):
        print(f'O maior valor é {item}, foi o {c + 1}° a ser digitado.')

# print(f'O menor valor digitado foi {min(valores)}, na posição ' )
