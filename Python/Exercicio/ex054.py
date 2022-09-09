from datetime import datetime

print('=-'*5, '{}{:^15}{}'.format('\033[34m', 'MAIORIDADE', '\033[m'), '-='*5)
print()
maiores = 0
menores = 0
maioridade = int(datetime.now().year - 21)
for c in range(1, 8):
    nas = int(input('Digite seu ano de nascimento da {}° pessoa: '.format(c)).strip())
    if nas > maioridade:
        menores += 1
    elif nas < maioridade:
        maiores += 1
    else:
        maiores += 1
print('No total temos {} pessoas maiores de idade. '.format(maiores), end='')
print('E temos {} menores.'.format(menores))

