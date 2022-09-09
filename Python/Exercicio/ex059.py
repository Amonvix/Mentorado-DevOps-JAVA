print('-=' * 10, 'ANALISADOR DE VALORES', '=-' * 10)
print()

soma = 0
vezes = 0
maior = 0

n1 = int(input('Digite o primeiro valor: '))
n2 = int(input('Digite o segundo valor: '))

print('-=' * 5, 'Opções', '=-' * 5)
print()
print('''Escolha uma das opções abaixo:

[ 1 ] <==> SOMA 
[ 2 ] <==> MULTIPLICAÇÃO
[ 3 ] <==> MAIOR
[ 4 ] <==> DIGITE NOVOS VALORES
[ 5 ] <==> FECHAR''')

opcao = int(input('Opção: '))

while opcao != 5:
    if opcao > 5:
        print('Erro. Tente novamente')
    if opcao == 1:
        soma = n1 + n2
        print()
        print('Voce escolheu a opção 1 - SOMA')
        print()
        print('A soma de {} e {} é {}'.format(n1, n2, soma))
        print()
    print('-=' * 5, 'Opções', '=-' * 5)
    print()
    print('''Escolha uma das opções abaixo:

    [ 1 ] <==> SOMA 
    [ 2 ] <==> MULTIPLICAÇÃO
    [ 3 ] <==> MAIOR
    [ 4 ] <==> DIGITE NOVOS VALORES
    [ 5 ] <==> FECHAR''')
    opcao = int(input('Opção: '))
    if  opcao == 2:
        vezes = n1 * n2
        print()
        print('Voce escolheu a opção 2 - MULTIPLICAÇÃO')
        print()
        print('A Multiplicação entre {} e {} da {}.'.format(n1, n2, vezes))
        print()
    print('-=' * 5, 'Opções', '=-' * 5)
    print()
    print('''Escolha uma das opções abaixo:

        [ 1 ] <==> SOMA 
        [ 2 ] <==> MULTIPLICAÇÃO
        [ 3 ] <==> MAIOR
        [ 4 ] <==> DIGITE NOVOS VALORES
        [ 5 ] <==> FECHAR''')
    opcao = int(input('Opção: '))
    if opcao == 3:
        if n1 > n2:
            maior = n1
        else:
            maior = n2
        print()
        print('Voce escolheu a opção 3 - MAIOR VALOR')
        print()
        print('O numero maior entre {} e {} é o numero {}'.format(n1, n2, maior))
        print()
    print('-=' * 5, 'Opções', '=-' * 5)
    print()
    print('''Escolha uma das opções abaixo:

        [ 1 ] <==> SOMA 
        [ 2 ] <==> MULTIPLICAÇÃO
        [ 3 ] <==> MAIOR
        [ 4 ] <==> DIGITE NOVOS VALORES
        [ 5 ] <==> FECHAR''')
    opcao = int(input('Opção: '))
    if opcao == 4:
        print()
        print('Voce escolheu a opção 4 - DIGITAR NOVOS VALORES')
        print()
        n1 = int(input('Digite o primeiro valor: '))
        n2 = int(input('Digite o segundo valor: '))
    print('-=' * 5, 'Opções', '=-' * 5)
    print()
    print('''Escolha uma das opções abaixo:

            [ 1 ] <==> SOMA 
            [ 2 ] <==> MULTIPLICAÇÃO
            [ 3 ] <==> MAIOR
            [ 4 ] <==> DIGITE NOVOS VALORES
            [ 5 ] <==> FECHAR''')
    opcao = int(input('Opção: '))
    if opcao > 5:
        print('Erro. Tente novamente')
else:
    print('O programa terminou.', end='')
    print('Agradescemos a preferência!')

print('Terminou!')