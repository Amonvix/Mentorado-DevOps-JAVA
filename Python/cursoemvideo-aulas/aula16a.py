lanche = 'hamburguer', 'suco','pizza', 'pudim', 'batata frita'  # tupla!

for comida in lanche:  # não tem a possibilidade de se mostrar o contador
    print(f'eu vou comer {comida}')
print('estou satisfeito')

for c in range(0, len(lanche)):
    print(f'Eu vou comer {lanche[c]} na posição {c}')  # este comando mostra a posição que o iten esta na tupla
print('estou satisfeito')

for pos, comida in enumerate(lanche): # enumerate para contar as vezes (usar o count [pos])
    print(f'eu vou comer {comida} na posição {pos}')  # este comando mostra a posição que o iten esta na tupla
print('estou satisfeito')

print(sorted(lanche))  # sorted = usado para colocar as coisas em ordem alfabetica
