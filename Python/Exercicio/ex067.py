print('=' * 30)
num = 1
c = 0

while True:
    num = int(input('Digite um numero para calcular a tabuada: '))
    print('=' * 30)
    if num <= 0:
        break
    else:
        for c in range(1, 11):
            print('{:2} x {:2} = {:3}'.format(num, c, (num * c)))
    print('=' * 30)
print('O programa Terminou!')
