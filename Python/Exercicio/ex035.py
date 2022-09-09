# calculo de possibilidade de triangulo
print('=*=' *20)

r1 = float(input('Digite o comprimento da reta 1: ').strip())
r2 = float(input('Digite o comprimento da reta 2: ').strip())
r3 = float(input('Digite o comprimento da reta 3: ').strip())

if r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2:
    print('É possivel formar um triangulo com esses valores!')

else:
    print('O triangulo não é possivel!')

print('Fim')

