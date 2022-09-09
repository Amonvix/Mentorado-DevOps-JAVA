from datetime import datetime

nas = int(input('Em que ano nasceu nosso atleta? ').strip())

now = datetime.now()
idade = now.year - nas

if idade <= 9:
    print('Este(a) é um(a) atleta MIRIM.')
elif idade <= 14:
    print('Este(a) é um(a) atleta INFANTIL.')
elif idade <= 19:
    print('Este(a) é um(a) atleta JUNIOR.')
elif idade <= 25:
    print('Este(a) é um(a) atleta SENIOR.')
else:
    print('Este(a) é um(a) atleta MASTER.')


print(idade)