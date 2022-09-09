temp = []  # lista temporaria para transferencia de dados para a lista principal
princ = []  # lista principal onde ficarão os valores finais
maior = menor = 0  # variaveis simples igualadas a zero para armazenamento de maiores e menores pesos

while True:  # loop infinito para coleta de dados

    temp.append(str(input('Nome: ').title().strip()))  # input nome do usario
    temp.append(float(input('Peso: ')))                # input peso do usuario

    if len(princ) == 0:          # verificação de itens dentro da lista principal
        maior = menor = temp[1]  # atribuição de valores às variaveis maior e menor

    else:                     # senão oposto a verificação da lista principal
        if temp[1] >= maior:  # Se peso maior que o maior
            maior = temp[1]   # maior recebe o valor de peso

        if temp[1] <= menor:  # Se peso menor que menor
            menor = temp[1]   # menor recebe o valor de peso

    princ.append(temp[:])     # copiado valor da lista temp para dentro da lista princ
    temp.clear()              # excluidos os valores contidos em temp

    resp = str(input('Quer continuar? [S/N] '))   # input para recebimento da condição loop
    if resp in "nN":                              # verificação de condicional do loop infinito
        break                                     # término do loop para coleta de dados

print('=-' * 30)                                  # Linha separatoria

print(f'Foram cadastradas {len(princ)} pessoas')  # informação da quantidade de itens em lista princ
print(f'O maior peso foi de {maior:.2f} kilos')   # exibição da variavel maior


for p in princ:                                   # Varredura da lista princ
    if p[1] == maior:                             # Comparação de valores entre itens da lista e variavel maior
        print(f'[{p[0]}]', end='')                # exibe todos os itens iguais a variavel maior
print()                                           # Linha vazia
print(f'O menor peso foi de {menor:.2f} kilos')   # exibição da variavel maior
for p in princ:                                   # Varredura da lista princ
    if p[1] == menor:                             # Comparação de valores entre itens da lista e variavel menor
        print(f'[{p[0]}]', end='')                # exibe todos os itens iguais a variavel maior
