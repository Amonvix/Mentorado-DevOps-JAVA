from time import sleep

def contador(i, f, p):
    print('-=' * 30 )
    print(f'Contagem de {i} até {f}, de {p} em {p}.')
    for c in range(i, f + 1, p):
        print(c, end=' ')
        sleep(.5)
    print('FIM')




#programa principal
contador(1, 10, 1)
contador(10, 0, -2)
print('Agora é sua vez de personalizar a contagem!')
inicio = int(input('Início: '))
termino = int(input('Término: '))
passo = int(input('Passo: '))
contador(inicio, termino, passo)

