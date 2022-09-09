estado = dict()  #criado o dicionario ESTADO
brasil = list()  #criada a lista BRASIL

for c in range(0,3):  #criado laço para contagem
    estado['UF'] = str(input('Unidade Federativa: ')).upper()  #coleta do indice uf para o dicionairio
    estado['SIGLA'] = str(input('Sigla do Estado: ')).upper()  #coleta do indice sigla para o dicionario
    brasil.append(estado.copy())  #comando usado para copiar o conteudo do dicionario pra dentro da lista

for e in brasil:  # criado laço para verificação de cada item em BRASIL
    for k, v in e.items():  # para cada chave e valor em items de E:
        print(f'O campo "{k}" tem o valor {v}')  # exibe print formatado com chave e valor
print('fim')