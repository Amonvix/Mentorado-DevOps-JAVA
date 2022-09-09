estado = dict()  #criado o dicionario ESTADO
brasil = list()  #criada a lista BRASIL

for c in range(0,3):  #criado laço para contagem
    estado['uf'] = str(input('Unidade Federativa: ')).upper()  #coleta do indice uf para o dicionairio
    estado['sigla'] = str(input('Sigla do Estado: ')).upper()  #coleta do indice sigla para o dicionario
    brasil.append(estado.copy())  #comando usado para copiar o conteudo do dicionario pra dentro da lista

for e in brasil:  # para cada estado em BRASIL:
    for v in e.values():  # para cada valor em valores de E:
        print(v, end=' ')  # exibe cada um dos valores do dicionario sem pular a linha
    print()  # linha em branco