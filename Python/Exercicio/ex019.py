import random

aluno1 = input('Primeiro Aluno: ')
aluno2 = input('Segundo Aluno: ')
aluno3 = input('Terceiro Aluno: ')
aluno4 = input('Quarto Aluno: ')
lista = [aluno1, aluno2, aluno3, aluno4]
# Comando para fazer sorteios.
print('O Aluno escolhido foi {}! PARABÉNS'.format(random.choice(lista)))
