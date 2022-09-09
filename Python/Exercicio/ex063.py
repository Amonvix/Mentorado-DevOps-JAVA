print('sequencia fibonaci')

'''A regra é a seguinte:
O primeiro número da série é 1
O segundo número da série é 1 também
O próximo número da série é sempre a soma dos dois anteriores
'''

n = int(input('Quantos elementos Fibonacci iremos exibir? '))
t1 = 1
t2 = 1
print('{} => {}'.format(t1, t2), end='')
c = 3
while c <= n:
    t3 = t1 + t2
    print(' => {}'.format(t3), end='')
    c +=1
    t1 = t2
    t2 = t3

print(' => fim')

