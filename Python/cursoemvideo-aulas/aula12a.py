nome = str(input('qual o seu nome?').strip().lower())

if nome == 'daniel':
    print('que nome da hora!')
elif nome in ('maria juliana claudia jessica'):
    print('nome feminino')

else:
    print('nome normal!')

print('FIM')