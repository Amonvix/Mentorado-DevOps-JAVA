c = 0
lista = []
while True:
    lista.append(int(input('Digite um valor: ')))
    c += 1
    r = str(input('Quer continuar? [S/N]')).strip()[0]
    if r in 'Nn':
        break
print(f'Foram digitados {c} numeros. ')
lista.sort(reverse=True)
print(f'Os numeros em ordem inversa são {lista}')
if 5 in lista:
    print('O numero 5 foi reconhecido na listagem de valores. ')
    print(f'Foram encontrados {lista.count(5)} vezes o numero 5.')

else:
    print(f'O numero cinco não foi digitado')