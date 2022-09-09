print('=-'*10, '{}'.format('Mais e Menos pesados'), '-='*10)
print()
print()


pesado = 0
leve = 0
for p in range(1, 6):
    peso = float(input('Digite o peso da {}° pessoa: '.format(p)))
    if p == 1:
        pesado = peso
        leve = peso

    else:
        if peso > pesado:
            pesado = peso
        if peso < leve:
            leve = peso

print('O maior peso lido foi de {:.1f} Kilogramas'.format(pesado))
print('O menor peso lido foi de {:.1f} Kilogramas'.format(leve))
