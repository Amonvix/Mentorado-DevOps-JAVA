# calculo de ano bissexto

ano = int(input('Qual ano vamos calcular? ').strip())

if (ano % 4 == 0 and ano % 100 != 0) or ano % 400 == 0:
    print('O ano de {}, é bissexto'.format(ano))

else:
    print("O ano de {}, não é bissexto.".format(ano))
