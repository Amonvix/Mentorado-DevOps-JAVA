galera = list()  # criada a lista galera
dado = list()  # criada a lista dado
maior = menor = 0


for c in range(0, 3):  # contagem de 0 ate 3
    dado.append(str(input('Nome: ')).title())  # input de nome na lista dado grupo 0 posição 0
    dado.append(int(input('Idade: ')))  # input de idade na lista dado no mesmo grupo posição 1
    galera.append(dado[:])  # inserido os valores da lista dado na lista galera
    dado.clear()  # efetuada a limpeza da lista para a coleta dos proximos dados

for p in galera:  # varredura da lista galera item por item
    if p[1] >= 21:  # condicional para checagem de maioridade
        print(f'{p[0]} é maior de idade.')  # amostragem de maiores
        maior += 1  # contator mais para quantificar maiores de idade
    else:
        print(f'{p[0]} é menor de idade.')  # amostragem de menores
        menor += 1  # contator mais para quantificar menores de idade
print(f'Temos {maior} maiores e {menor} menores.')

