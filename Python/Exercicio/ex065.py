n1 = media = soma = maior = menor = cont = 0
pergunta = 'S'

while pergunta != 'N':
    n1 = int(input('Digite um numero: '))
    soma = soma + n1
    cont += 1
    if cont == 1:
        maior = menor = n1
    else:
        if n1 > maior:
            maior = n1
        if n1 < menor:
            menor = n1
    pergunta = str(input('Quer continuar? [S / N] ')).upper().strip()[0]
media = soma / cont
print("O numero maior é {}, o numero menor é {}, a média entre todo eles é {:.2f}.".format(maior, menor, media))
print('A soma de todos os fatores é {}. E foram calculados {} numeros'.format(soma, cont))
