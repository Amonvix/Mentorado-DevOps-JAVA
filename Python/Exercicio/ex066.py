cont = 0
res = 0
while True:
    num = int(input('Digite um número: [999 - ENCERRA PROGRAMA] '))
    if num == 999:
        break
    else:
        res += num
        cont +=1
print(f'Foram calculados {cont} numeros com uma soma total de {res}.')
