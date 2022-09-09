lista = []
listapar = []
listaimpar = []
while True:
    n = (int(input('Digite um valor: ')))
    lista.append(n)
    if n % 2 == 0:
        listapar.append(n)
    else:
        listaimpar.append(n)
    r = str(input('Quer continuar? [S/N] '))
    if r in 'Nn':
        break
print(f'Os valores digitados foram: {lista}')
print(f'Foram registrados os valores {listaimpar} com impares')
print(f'São pares os numeros: {listapar}')
