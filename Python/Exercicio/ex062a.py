from time import sleep
print('Gerador de PA')


primeiro = int(input('Digite o primeiro termo: '))
razao = int(input('Digite a Razão:'))
cont = 0
termo = primeiro
mais = 10
total = 0
while mais != 0:
    total = total + mais
    while cont < total:
        print('{} => '.format(termo), end='')
        termo += razao
        cont += 1

    print('Loading')
    sleep(2)
    mais = int(input('Quantos numeros mais vamos calcular? '))