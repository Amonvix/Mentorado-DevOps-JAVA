def leiaInt(msg=''):
    ok = False
    valor = 0
    while True:
        n = str(input(msg))
        if n.isnumeric():
            valor = int(n)
            ok = True
        else:
            print(f'\33[1;31;45mErro! Digite um número inteiro válido.\33[m ')
        if ok:
            break
    return valor


print('-'*30)
n = leiaInt('Digite um número: ')
print(f'\033[1;32mVoce acabou de digitar o número {n}\033[m')
print('\33[1;31mTERMINOU')
