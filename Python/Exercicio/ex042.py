"""Classificação de triangulos"""

rint('=*=' *20)

r1 = float(input('Digite o comprimento da reta 1: ').strip())
r2 = float(input('Digite o comprimento da reta 2:' ).strip())
r3 = float(input('Digite o comprimento da reta 3: ').strip())
cal = r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2

if (r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2) and r1 == r2 == r3:
    print('É possivel formar um triangulo com esses valores!')
    print('Este é um triangulo EQUILÁTERO!')

elif (r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2) and (r1 == r2 or (r1 == r3) or r3 == r2):
    print('É possivel formar um triangulo com esses valores!')
    print('Este é um triangulo ISÓSCELES!')

elif (r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2) and r1 != r2 != r3 != r1:
    print('É possivel formar um triangulo com esses valores!')
    print('Este é um triangulo ESCALENO!')

else:
    print('O triangulo não é possivel!')

print('Fim')