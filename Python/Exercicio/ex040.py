

n1 = float(input('Digite a nota do primeiro semestre: ').strip())
n2 = float(input('Digite a nota do segundo semestre: ').strip())

media = (n1 + n2) / 2
print('*' * 500)
print('\o/' * 50)
print()
print()

if media < 5:
    print('Voce foi {}REPROVADO{}, Sua nota foi {}. Estude mais!'.format('\033[1;31m', '\033[m', media))

elif (media >= 5) and (media < 6.9):
    print('Voce quase atingiu a media, sua nota foi de {}! Tenha uma boa {}RECUPERAÇÃO{}.'.format(media, '\033[1;33m', '\033[m'))

else:
    print('{}PARABÉNS{} voce foi aprovado com a nota {}. Continue assim!'.format('\033[1;32m', '\033[m', media))

print()
print()

print('*.*.' * 50)
print('Este programa é movido a lágrimas dos alunos que não estudaram'.upper())
