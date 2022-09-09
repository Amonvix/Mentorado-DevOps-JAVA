def voto(nasc):
    """
    -> Função para calcular o voto obrigatorio com base no anos de nascimento
    :param nasc: informação sobre o ano de nascimento
    :return: sem retorno
    """
    from datetime import date
    idade = date.today().year - nasc
    if idade < 16:
        return f'Com {idade} anos: Voto não permitido.'
    elif 16 <= idade < 18 or idade > 65:
        return f'Com {idade} anos: Voto facultativo.'
    else:
        return f'Com {idade} anos: Voto Obrigatório!'


# programa principal
print('-='*30)
nasc = (int(input('Em que ano voce nasceu?: ')))
print(voto(nasc))
print('-='*30)
