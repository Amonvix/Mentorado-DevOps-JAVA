def aumento(preço=0, taxa=0, format=False):
    res = preço + (preço * taxa / 100)
    return res if format is False else moeda(res)


def diminuir(preço=0, taxa=0, format=False):
    res = preço - (preço * taxa / 100)
    return res if format is False else moeda(res)


def dobro(preço=0, format=False):
    res = preço * 2
    return res if format is False else moeda(res)


def metade(preço=0, format=False):
    res = preço / 2
    return res if format is False else moeda(res)


def moeda(preço=0, moeda='R$'):
    return f'{moeda}{preço:>8.2f}'.replace('.', ',')


def titulo():
    print('-' * 30)
    print(f'{"RESUMO DE VALORES":^30}')
    print('-' * 30)


def resumo(preço=0, juros=10, desconto=5):
    titulo()
    print(f'{"Preço analisado:":<20}', end="")
    print(f'{moeda(preço):>10}')
    print(f'{"Dobro do Preço:":<20}', end='')
    print(f'{moeda(dobro(preço)):>10}')
    print(f'{"Metade do preço:":<20}', end='')
    print(f'{moeda(metade(preço)):>10}')
    print(f'{juros:<1}{"% de JUROS:":<18}', end="")
    print(f'{moeda(aumento(preço, juros)):>10}')
    print(f'{desconto:<1}{"% de DESCONTO:":<18}', end='')
    print(f'{moeda(diminuir(preço, desconto)):>10}')
    print('-' * 30)