valores = list()  # cria a lista vazia

for cont in range(0,5):  # contador de 0 a 5
    valores.append(int(input('Digite um valor: ')))  # input teclado
print(valores)

for c, item in enumerate(valores):
    print(f'Na posição {c}, encontrei o valor: {item} ')  # vai mostrar cada um dos itens lidos pelo teclado
    