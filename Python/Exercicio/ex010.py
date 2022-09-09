din = float(input('Quantos Reais voce quer investir em dolares? R$ '))
cot = float(input('Qual o valor do dolar na cotação atual? : R$ '))
dol = din / cot
tr = din % cot
print('Podemos comprar o valor de USD {:.2f} Dolares.'.format(dol))
print('Sobrando o valor de R$ {:.2f} centavos.'.format(tr))
