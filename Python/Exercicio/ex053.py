print('=-'*5, '{}{:^15}{}'.format('\033[31m', 'PALÍNDROMOS', '\033[m'), '-='*5)
print()
print()

frase = str(input('Digite uma frase para analise: ').strip().upper())
palavas = frase.split()
junto = ''.join(palavas)
inverso = ''
for letra in range(len(junto) -1, -1, -1):
    inverso += junto[letra]

print('A frase "{}",: '.format(frase))

if junto == inverso:
    print('É um {}{}{}'.format('\033[31m', 'PALÍNDROMO', '\033[m'))

else:
    print('Não é um PALÍNDROMO!')


