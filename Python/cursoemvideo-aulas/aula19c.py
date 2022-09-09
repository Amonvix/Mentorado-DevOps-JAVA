brasil = []  # criada a lista BRASIL
estado1 ={'uf': "rio de janeiro", 'Sigla':'RJ'}  # criado dicionario ESTADO1
estado2 = {'uf': 'São Paulo', 'Sigla': 'SP'}     # criado dicionario ESTADO2
brasil.append(estado1)  # inseridos os valores e itens de ESTADO1 dentro da lista BRASIL
brasil.append(estado2)  # inseridos os valores e itens de ESTADO2 dentro da lista BRASIL

print(brasil[0]['Sigla'])  # exibe a chave SIGLA na posição 0 da lista BRASIL
print(brasil[1]['uf'])  # exibe a chave UF na posição 1 da lista BRASIL
