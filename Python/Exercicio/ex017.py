import math

opo = float(input('Digite o valor do cateto oposto: '))
adj = float(input('Digite o valor do cateto adjacente: '))
# formula para calcular o teorema de pitagoras a²+b²=c²
hip = opo ** 2 + adj ** 2
raiz = math.sqrt(hip)
print('O valor da hipotenusa é {:.4f}'.format(math.hypot(opo, adj))) # usando modulo
print('O valor da hipotenusa é {:.4f} £'.format(raiz)) # usando algoritimo proprio
