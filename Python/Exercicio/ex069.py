#cadastro dinamico

maior = homens = mulheres = 0
resposta = ' '
while resposta != 'N':
    print('-' * 40)
    print('{:^40}'.format('CADASTRE UMA PESSOA'))
    print('-' * 40)
    idade = int(input('Idade: ').strip())
    sexo = str(input('Sexo: [M/F]')).strip().upper()[0]
    while sexo not in "M, F":
        sexo = str(input('Sexo: [M/F]')).strip().upper()[0]
    resposta = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    while resposta not in "S, N":
        resposta = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    if idade >= 18:
        maior += 1
    if sexo == "M":
        homens += 1
    if sexo == "F" and idade < 20:
        mulheres += 1

else:
    print('-=' * 40)
    print(f'Tivemos um total de {maior} pessoas maiores que 18 anos. '
          f'Foram cadastrados {homens} homens. ')
    print(f'E um total de {mulheres} mulheres tem menos que 20 anos. ')
    print('-=' * 40)
print("PROGAMA ENCERRADO COM SUCESSO")