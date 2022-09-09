# multa de transito

vel = int(input('A qual velocidade estava o veiculo no momento da passagem em Km/h? :').strip())

if vel >= 80:
    multa = (vel - 80)
    print('Voce acaba de exceder o limite de velocidade em {} Km/h.'.format(multa))
    print('Voce acaba de ganhar uma multa no valor de R$ {:.2f}. Dirija com maior atenção!'.format(multa * 7))

else:
    print('Voce não foi multado desta vez, continue cumprindo com sua obrigação!')
print('Respeite as leis de transito!')
