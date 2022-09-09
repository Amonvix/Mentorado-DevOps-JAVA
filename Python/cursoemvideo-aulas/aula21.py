def fat(num=1):
    """
    -> Função para calculo de fatorial
    :param num: valor a ser calculado
    :return: retorno do calculo fatorial
    """
    f = 1
    for c in range(num, 0, -1):
        f *= c
    return f


n = int(input('Digite um numero: '))  # input de valor a ser calculado
print(f'O fatorial de {n} é {fat(n)}!')  # print com o calculo da função fat
print('-=' * 30)

n1 = fat(5)  # retorno da função armazenado na variavel
n2 = fat(4)  # retorno da função armazenado na variavel
n3 = fat()  # retorno da função armazenado na variavel
print()
print(f'O valores fatoriais são {n1, n2, n3}.')  # exibe os resultados armazenados em cada uma das funções
