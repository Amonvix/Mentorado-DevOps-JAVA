"""Calculo da prestação de um protudo com juros ou desconto"""

preco = float(input('Qual o valor do produto? : ').strip())
tipo = str(input('Qual será a forma de pagamento? ').strip().upper())
vezes = int(input('Em quantas vezes? ').strip())

desconto10 = preco * 1.10 - preco
desconto5 = preco * 1.05 - preco
juros20 = preco * 1.20

print(tipo)
print()
if vezes == 1 and tipo == 'CHEQUE' or tipo == 'DINHEIRO':
    print('O valor de sua compra com o desconto de 10%, será {:.2f}.'.format(preco - desconto10))
elif vezes == 1 and (tipo == 'CARTÃO' or tipo == 'CARTAO'):
    print('O valor de seu compra com o desconto de 5%, será de {:.2f}.'.format(preco - desconto5))
elif vezes >= 3 and (tipo == 'CARTÃO' or tipo == 'CARTAO'):
    print('Sua parcela mensal será de R${:.2f} em {} vezes.' .format(juros20 / vezes, vezes))
else:
    print('O valor de sua compra é de R${}, ou {} vezes de R${}.'.format(preco, vezes, preco / vezes))
print('Agradescemos a preferencia!')
