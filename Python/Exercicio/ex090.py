aluno = {}
aluno['nome'] = str(input('Nome: ')).upper().strip()
aluno['media'] = float(input(f'Média do {aluno["nome"]}: '))
print('-=' * 30)
print(f' - O nome do aluno é: {aluno["nome"]}')
print(f' - sua média foi de: {aluno["media"]}')
if aluno['media'] > 7:
    aluno['situacao'] = 'APROVADO'
elif 5 <= aluno['media'] < 7:
    aluno['situacao'] = 'RECUPERAÇÃO'
else:
    aluno['situacao'] = 'REPROVADO'
print(f' - O aluno {aluno["nome"]} esta {aluno["situacao"]}')
print()
# resolução 2:
for k, v in aluno.items():
    print(f' - {k} é igual a {v}')


