"""name = input('Digite seu nome completo: ').strip()
lis = (name.split()) # criação da lista separando as string pelo espaço
junto = ''.join(lis) # comando para remover os espaços da string
print('O seu nome em maiúsculas é {}. '.format(name.upper())) # comando para deixar caixa alta
print('o seu nome em minúsculas é {}. '.format(name.lower())) # comando para deixar caixa baixa
print('Seu nome conte contem {} letras. '.format(len(junto))) # contagem de letras da string toda
print('Seu primeiro nome tem {} letras '.format(len(lis[0]))) # contagem de letras da primeira palavra da string """

nome = str(input('Digite seu nome completo: ')).strip()
print('Analisando seu nome...')
print('Seu nome em maiusculas é {}'.format(nome.upper()))
print('Seu nome em minusculas é {}'.format(nome.lower()))
print('Seu nome tem ao todo {} letras'.format(len(nome) - nome.count(' ')))
print('Seu primeiro nome tem {} letras'.format(nome.find(' ')))
