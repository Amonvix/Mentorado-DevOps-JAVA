# Calculo valor por kilometragem

dis = int(input('Qual será a distância de sua viagem? : ').strip())

if dis <= 200:
    print('O valor desta viagem será de R${:.2f}, com base nos {} Kilometros de distância.'.format((dis * 0.5), dis))

else:
    print('O valor de sua viagem será de R${:.2f}, com base nos {} Kilometros de distância'.format((dis * 0.45), dis))

print('Tenha uma boa viagem!')