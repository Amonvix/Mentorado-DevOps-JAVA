print('Gerador de PA')

primeiro = int(input('Digite o primeiro termo: '))
razao = int(input('Digite a Razão:'))
cont = 1
termo = primeiro
mais = 10
total = 0
while mais != 0:
    total += mais
    while cont <= total:
        print('{} => '.format(termo), end='')
        termo += razao
        cont += 1
    print('pausa')
    mais = int(input('Quantos termos mais queres ver?: "0" encerra o programa '))
print()
print('Foram calculados {} termos.'.format(total))
print('fim')
