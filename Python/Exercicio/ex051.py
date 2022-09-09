"""Progressão Aritimética!!!"""

print("=-" * 5, "{:^10}".format('PROGRESSÃO ARITIMÉTCA!!!'), "=-" * 5)
print()
print()

pri = int(input('Digite o primeiro termo: '))
raz = int(input('Qual será a razão para o cálculo: '))
decimo = pri + (10 - 1) * raz
for c in range(pri, decimo + raz, raz):
    print(c)

print('fim')