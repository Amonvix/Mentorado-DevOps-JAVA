listagem = ('lapis ', 1.75,
            'borracha ', 2,
            'caderno ', 15.90,
            'estojo ', 25,
            'transferidor ', 4.20,
            'compasso ', 9.99,
            'mochila ', 120.32,
            'canetas ', 22.30,
            'livros ', 34.90)
print('-=' * 30)
print(f'{"LISTAGEM DE PREÇOS":^50}')
print('-=' * 30)

for p in range(0, len(listagem)):
    if p % 2 == 0:  # pega todos os itens nas posições pares
        print(f'{(listagem[p]):-<30}', end='')
    else:  # listagem exibindo os resultados na direita
        print(f'R$ {listagem[p]:>6.2f}')
