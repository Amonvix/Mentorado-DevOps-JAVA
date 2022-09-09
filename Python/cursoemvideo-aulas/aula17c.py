a = [2, 3, 4, 7]  # criada lista manualmente
b = a[:]  # comando usado para copiar o conteudo da lista "a" para dentro da lista "b"
b[2] = 8  # muda o iten na posição [] para o valor informado

print(f'Lista A: {a}')  # print itens da lista a
print(f'Lista B: {b}')  # print itens da lista b

for c, item in enumerate(a):
    print(f'achei o item {item}, na posição {c} da lista A.')
print()
for c, item in enumerate(b):
    print(f'achei o item {item}, na posição {c} da lista B.')
