n = 1
par = 0
impar = 0
while n != 0:
    n = int(input('Digite um numero: '))
    if n != 0:
        if n % 2 == 0:
            par+=1
        else:
            impar+=1


print('Foram {} numeros pares e {} numero impares.'.format(par, impar))
