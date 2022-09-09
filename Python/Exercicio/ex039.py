import datetime
from time import sleep


nas = int(input('Digite o ano em que voce nasceu! : ').strip())

now = datetime.datetime.now()
idade = now.year - nas

print('CARREGANDO .........')
sleep(3)

if idade < 18:
    print('Esta chegando o momento de servir a sua patria! Faltam {} anos.'.format(18 - idade))

elif idade > 18:
    print('O momento do seu alistamento ja passou! Voce esta atrasado {} anos'.format(idade - 18))

else:
    print('Esta na hora de se alistar')

print('Sua idade atual é de :', idade, 'anos')
