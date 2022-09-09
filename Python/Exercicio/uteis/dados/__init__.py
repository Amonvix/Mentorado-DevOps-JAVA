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


def leiaFloat(msg):
    while True:
        try:
            n = float(input(msg))
        except (ValueError, TypeError):
            print('\033[31mErro - Por favor, digite um numero inteiro vállido!\033[m ')
            continue
        except (KeyboardInterrupt):
            print('\n\033[31mErro - O usuário preferiu encerrar\033[m')
            return 0
        else:
            return n