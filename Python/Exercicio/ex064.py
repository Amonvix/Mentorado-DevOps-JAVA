
n1 = res = c = 0
while n1 != 999:
    n1 = int(input('Digite um numero: '))
    res += n1
    c += 1
print(res - n1)
print("foram calculados {} numeros.".format(c-1))
print('terminado!')