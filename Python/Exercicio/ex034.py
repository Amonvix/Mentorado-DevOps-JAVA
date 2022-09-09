# calculo condicional de salario

sal = float(input('Digite o seu salario para calcular o aumento: R$ ').strip())

if sal <= 1250.00:
    print('Seu novo salario sera de R${:.2f}.'.format(sal * 1.15))

else:
    print('Seu novo salario sera de R${:.2f}.'.format(sal * 1.10))

print('Use com moderação!')
