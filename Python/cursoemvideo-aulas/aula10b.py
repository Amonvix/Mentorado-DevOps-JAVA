n1 = float(input('Digite a nota do primeiro semestre: ').strip())
n2 = float(input('Digite a nota do segundo semestre: ').strip())

m = (n1 + n2) / 2

print('Sua média foi de {:.1f}'.format(m))
if m >= 7.0:
    print('Você atingiu a média minima, PARABÉNS!!!')

else:
    print('Faltou um pouco para atingir a média minima, estude um pouco mais!')

print('TERMINADO')
