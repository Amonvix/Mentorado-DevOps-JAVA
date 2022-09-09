# Tabuada 2.0
print()
print( "*****" * 3, "{:^10}".format('Tabuada 2.0'), "*****" * 3)
print()

den = int(input('Digite qual o denominador que vamos multiplicar: '))
for c in range(1, 11):
    print('{:2} x {:2} = {:3}'.format(den, c, (den * c)))
print('fim')