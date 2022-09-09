num = [2, 5, 9, 1]  # criada lista

num[2] = 3  # muda o item na posição 2 para o numero atribuido
num.append(7)  # adiciona o numero 7 ao final da lista em uma posição nova
num.sort()  # ordena a lista em forma crescente
print(num)
print(f'Essa lista tem {len(num)} itens. ')  # len(lista) mostra a quantidade de itens em uma lista
if 7 in num:   # verifica se tem o item na lista e em caso positivo
    num.remove(7)  # remove o item da lista

num.insert(2, 0)
num.pop()
print(num)
print(f'Essa lista tem {len(num)}.')
