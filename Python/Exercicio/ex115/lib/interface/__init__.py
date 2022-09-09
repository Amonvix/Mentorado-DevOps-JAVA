def leiaInt(msg):
    while True:
        try:
            n = int(input(msg))
        except (ValueError, TypeError):
            print('\033[31mErro - Por favor, digite um numero inteiro vállido!\033[m ')
            continue
        except (KeyboardInterrupt):
            print('\n\033[31mErro - O usuário preferiu encerrar\033[m')
            return 0
        else:
            return n


def linha(tam=42):
    return '-' * tam


def head(txt):
    print(linha())
    print(txt.center(42))
    print(linha())


def menu(lista):
    head('Menu Principal')
    c=1
    for item in lista:
        print(f'\033[31m{c}\033[m - \033[34m{item}\033[m')
        c+=1
    print(linha())
    opc = leiaInt('\033[32mSua opção: \033[m')
    return opc

