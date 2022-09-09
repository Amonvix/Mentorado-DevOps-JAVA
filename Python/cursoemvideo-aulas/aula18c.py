galera = []  # criada a lista galera
dado = []  # criada a lista dado

for c in range(0,3):  # contagem de 0 ate 3
    dado.append(str(input('Nome: ')).title())  # input de nome na lista dado grupo 0 posição 0
    dado.append(int(input('Idade: ')))  # input de idade na lista dado no mesmo grupo posição 1
    galera.append(dado[:])  # inserido os valores da lista dado na lista galera
    dado.clear()  # efetuada a limpeza da lista para a coleta dos proximos dados

print(galera)  # print de todos os itens da lista galera

