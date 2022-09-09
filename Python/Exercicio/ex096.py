def area(a,b):
    l = a * b
    print(f'A área de um terreno de {a} X {b}  é de {l:5.1f}m²')


print("   Controle de Terrenos")
print('-' * 25)
largura = (float(input('LARGURA (m): ')))
comprimento = (float(input('COMPRIMENTO (m): ')))
area(largura, comprimento)
print("FIM")