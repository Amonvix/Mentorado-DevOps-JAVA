import math

ang = float(input('Digite o valor do angulo a ser calculado: '))
seno = math.sin(math.radians(ang))
cos = math.cos(math.radians(ang))
tan = math.tan(math.radians(ang))
print('O seno de {} é {:.2f}!'.format(ang, seno))  # SENO
print('O cosseno de {} é {:.2f}!'.format(ang, cos))  # COSSENO
print('O tangente de {} é {:.2f}!'.format(ang, tan))  # TANGENTE
