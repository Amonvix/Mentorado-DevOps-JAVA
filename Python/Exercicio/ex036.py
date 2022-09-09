# programa para calcular emprestimo bancário



print('*********** Meu Boleto, Minha Vida ***********')
sal = float(input('Digite o salário recebido mensalmente :').strip())
emp = float(input('Qual o valor do imóvel? ').strip())
prz = int(input('Em quantos meses esse valor será quitado? ').strip())
print('*' * 46)

par = emp / prz
mar = sal * 0.3

if par <= mar:
    print('Seu emprestimo foi {}APROVADO{}, com uma parcela de R${:.2f} ao mês.'.format('\033[1;32m','\033[m', par))

else:
    print('Sentimos muito mas sua solicitação foi {}REPROVADA{}'.format('\033[1;31m','\033[m'))
