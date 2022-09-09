# analisador de expressões

expre = str(input('Digite sua expressão: '))
pilha = []
for simbolo in expre:
    if simbolo == '(':
        pilha.append('(')
    elif simbolo == ')':
        if len(pilha) > 0:
            pilha.pop()
        else:
            pilha.append(')')
            break
if len(pilha) == 0:
    print(f'Sua equação esta correta!')

else:
    print('Equação invalida!')
