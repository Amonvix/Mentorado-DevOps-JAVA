fra = str(input('Digite uma frase em seu teclado: ')).strip().upper()



print('A letra "A" aparece {} vezes'.format(fra.count('A')))
print('A letra "A" aparece pela primeira vez na posição {}. '.format(fra.find('A')+1))
print('A letra "A" aparece pela ultima vez na posição {}.'.format(fra.rfind('A')+1))

