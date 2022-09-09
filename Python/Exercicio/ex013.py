sal = float(input('Qual o seu salario atual em Reais? '))
# o valor calculado se refere à porcentagem final. o valor que será aumentado no salario
saln = (sal * 15 / 100)
print('Seu novo salario será de R$ {}, a partir do próximo mês! Parabéns... '.format(saln + sal))
