"""Calculo de IMC"""

#nam = str(input('Olá, qual o seu nome? ').strip())
#print('Prazer em te conhecer {}.'.format(nam).upper())
alt = float(input('Qual a sua altura? ').strip())
pes = float(input('E qual o seu peso mais aproximado? ').strip())

imc = pes / (alt * alt)

print()
print()
print('Seu IMC é de {:.2f}'.format(imc))

if imc < 18.5:
    print('Abaixo do peso!')

elif 18.5 <= imc < 25:
    print('Peso Ideal')

elif 25 <= imc < 30:
    print('Sobrepeso')

elif 30 <= imc < 40:
    print('Obesidade')

else:
    print('Obesidade Morbida')