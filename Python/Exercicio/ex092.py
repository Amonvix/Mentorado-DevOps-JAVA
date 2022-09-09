from datetime import datetime
pessoa = dict()
pessoa['nome'] = str(input('Nome: ')).strip().upper()
nasc = int(input(f'Ano de nascimento de {pessoa["nome"]}: '))
pessoa['idade'] = datetime.now().year - nasc
pessoa['ctps'] = int(input(f'Carteira de Trabalho de {pessoa["nome"]} (0, se não possuir uma): '))
if pessoa['ctps'] != 0:
    pessoa['contratação'] = int(input(f'Ano de contratação de {pessoa["nome"]}: '))
    pessoa['salario'] = float(input(f'Salário de {pessoa["nome"]}: '))
    pessoa['aposentadoria'] = pessoa['idade'] + ((pessoa['contratação'] + 35) - datetime.now().year)
    print('-=' * 30)
    for k, v in pessoa.items():
        print(f' - {k} tem o valor {v}')
else:
    print('-=' * 30)
    for k, v in pessoa.items():
        print(f' - {k} tem o valor {v}')
