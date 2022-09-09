#Simulado de compras

print("=-" * 20)
print(f'{"LOJAS GUANABARA":^40}')
print("-=" * 20)

resp = produto = barato = ''
valor = total = maior = menor = 0

while resp != "N":
    produto = str(input('Nome do Produto: ')).strip().upper()
    valor = int(input('Preço R$: '))
    resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    total += valor
    menor = valor
    barato = produto
    if valor >= 1000:
        maior += 1
    if menor > valor:
        menor = valor
        barato = produto
    while resp not in "S, N":
        resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
else:
    print(f'O valor total das compras foi de R${total:.2f}')
    print(f'Foram comprados {maior} produtos com valor maior que R$ 1000.00')
    print(f'E o nome do produto mais barato é {barato}, no valor de R$:{menor:.2f}')



