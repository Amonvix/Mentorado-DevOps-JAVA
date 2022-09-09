teste = list()  # criada a lista teste

teste.append('Gustavo')  # "Gustavo" adicionado a lista teste
teste.append(40)  # 40 adicionado a lista teste
galera = list()  # criado a lista "galera"
galera.append(teste[:])  # [:] comando usado para copiar todo o conteudo da lista para dentro da outra

teste[0] = 'Daniel'  # alterado item na posição 0 para Daniel
teste[1] = 36  #alterado item na posição 1 para 36
galera.append(teste[:])  # Efetuada nova copia dos itens de teste em galera
print(galera)