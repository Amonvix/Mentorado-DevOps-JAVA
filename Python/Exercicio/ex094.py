pessoa = dict()
turma = list()
resp = ''
soma = 0
while resp in "Ss":
    pessoa['nome'] = str(input('Nome: ')).title().strip()
    pessoa['sexo'] = str(input('Sexo: [M/F] ')).upper()
    while pessoa['sexo'] not in "MmFf":
        print('Erro! Por favor, digite apenas "M" ou "F".')
        pessoa['sexo'] = str(input('Sexo: [M/F] '))
    pessoa['idade'] = int(input(f'Qual a idade de {pessoa["nome"]}? '))
    soma += pessoa['idade']
    turma.append(pessoa.copy())
    resp = str(input('Quer continuar [S/N]? ')).upper()
    while resp not in "NS" :
        print('Erro! Por favor, digite apenas "S" ou "N".')
        resp = str(input('Quer continuar [S/N]? ')).upper()
print('-=' *30)
print(f'A) Ao todo temos {len(turma)} pessoas cadastradas.')
print(f'B) A média de idade é de {soma / len(turma):5.2f} anos.')
print("C) As mulheres cadastradas foram ", end='')
for p in turma:
    if p['sexo'] == 'F':
        print(f'{p["nome"]}', end="")
print()
print("D) Lista das pessoas que estão acima da média:")

for i, c in enumerate(turma):
    if turma[i]['idade'] > (soma / len(turma)):
        print('  ', end='')
        for k, v in c.items():
            print(f'    {k} = {v}', end='; ')
        print()
print('<<< ENCERRADO >>>')
