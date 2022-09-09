valores = list()  # tambem pode ser criada usando "variavel = []"

valores.append(5)  # adiciona o numero informado ()
valores.append(9)  # adiciona o numero informado ()
valores.append(4)  # adiciona o numero informado ()

for item in valores:
    print(f'{item}...')  # printa cada um dos itens da lista

for c, item in enumerate(valores):  # usando esse comando conseguimos usar as posições da lista
    print(f'Na posição {c}, temos o valor: {item}...')

print('terminou')