def par(n=0):
    """
    -> Função para validação de numero par
    :param n: numero a ser validado pela função
    :return: True se o numero for par
    Função criada por Amon ;)

    """
    if n % 2 == 0:
        return True
    else:
        return False


n1 = int(input('Digite um numero: '))
if par(n1):
    print('É par!')
else:
    print('Não é par!')
print()
print()
print(f'O numero {n1} é um numero par: {par(n1)}.')
