"""JOKENPÔ"""
import random


pedra = ('pedra')
papel = ('papel')
tesoura = ('tesoura')
lista = [pedra, papel, tesoura]
computador = random.choice(lista)

user = str(input('PEDRA, PAPEL OU TESOURA? :').strip().lower())
print()
print(computador)

if user == papel and computador == pedra:
    print('WINNER!!')
elif user == pedra and computador == tesoura:
    print('WINNER!!!')
elif user == tesoura and computador == papel:
    print('WINNER!!!')
elif user == computador:
    print('EMPATE!!!')
else:
    print('Perdeu!!!')
