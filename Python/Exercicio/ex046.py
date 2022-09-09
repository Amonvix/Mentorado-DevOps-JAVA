from time import sleep
from random import randint

for c in range(10, 0, -1):
    itens = ('\033[31m', '\033[32m', '\033[33m', '\033[34m', '\033[35m')
    style = randint(0, 4)
    print('{}{}{}'.format(itens[style], c, '\033[m'))
    sleep(1)
print()
print()
print('BOOM!!!')
