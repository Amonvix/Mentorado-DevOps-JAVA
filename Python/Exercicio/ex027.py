name = input('Digite o seu nome completo : ').strip().title()

lis = name.split()

print('Prazer em te conhecer! ')
print('Seu primeiro nome é {}'.format(lis[0]))
print('Seu ultimo nome é {}' .format(lis[len(lis) - 1]))
print('Seu nome ocupa um total de {} espaços'.format(len(name)))
print('Voce possui um nome composto por {} nomes'.format(len(lis)))
