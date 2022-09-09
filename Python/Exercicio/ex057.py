genero = str(input('Escolha um gênero: [M/F] ')).strip().upper()[0]

while genero not in 'M,F':
    print(genero)
    genero = str(input('Entrada Invalida!!! Escolha um gênero: [M/F] ')).strip().upper()[0]

print('O genero escolhido foi {}.'.format('MASCULINO' if genero == 'M' else 'FEMININO'))
