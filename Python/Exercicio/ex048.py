"PROGRAMA PARA CALCULAR TODOS OS NUMEROS IMPARES ENTRE 0 E 500 QUE SEJAM MULTIPLOS DE 3"

s = 0

for c in range(1, 501, 2):
    if c % 3 == 0:

        print(c)
        s = s + c
print('resultado final é ',s )
