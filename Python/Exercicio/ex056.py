
somaidade = 0
mediaidade = 0
idadehomem = 0
nomevelho = ''
mulhernova = 0
for c in range(1,5):
    print('-='* 10, '{}° PESSOA'.format(c), '=-'*10)

    nome = str(input('Digite o seu nome: ').strip())
    idade = int(input('Digite sua idade: '))
    sexo = str(input('Digite o seu sexo: [M/F] ').upper())
    somaidade += idade
    mediaidade = somaidade / 4

    if c == 1 and sexo in 'M':
        idadehomem = idade
        nomevelho = nome
    if sexo in 'M' and idade > idadehomem:
        idadehomem = idade
        nomevelho = nome

    if sexo in 'F' and idade < 20:
        mulhernova += 1


print('A media de idade do grupo é {} anos.'.format(mediaidade))
print('O homem mais velho é o {}, com {} anos.'.format(nomevelho, idadehomem))
print('No grupo temos {} mulheres com menos de 20 anos.'.format(mulhernova))