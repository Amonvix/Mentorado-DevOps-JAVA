from random import randint

num = (randint(0, 20), randint(0, 20), randint(0, 20), randint(0, 20), randint(0, 20),)



print(f'Eu sorteei os valores {num}')
print(f'O maior valor sorteado foi: {max(num)}')
print(f'O menor valor sorteado foi: {min(num)}')
