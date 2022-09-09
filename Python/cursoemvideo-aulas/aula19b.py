pessoas = {'nome': 'Gustavo', 'sexo': 'M', 'idade': 22}   #Criado o dicionario "pessoas"
pessoas['peso'] = 98.5    #insere um novo indice no dicionario com o valor correspondente

for k in pessoas.keys():  #verificação via laço de cada uma dos indices do dicionario
    print(k)              #exibe os indices

print()
for v in pessoas.values():  #verificação via laço de cada uma dos valores do dicionario
    print(v)                #exibe os valores

print()
for k, v in pessoas.items():  #verificação via laço de cada uma dos indices e valores do dicionario
    print(f'{k} = {v}')       #exibe os indices seguidos dos valores