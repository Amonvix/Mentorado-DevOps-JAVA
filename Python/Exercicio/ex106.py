c = ('\033[m',
     '\033[0;30;41m',
     '\033[0;30;42m',
     '\033[0;30;43m',
     '\033[0;30;44m',
     '\033[0;30;45m',
     '\033[7;30;m',);

def titulo(msg, cor=0):
    """
    -> Função para dar um titulo ao programa
    :param msg: Valor a ser exibido
    :return: Valor formatado entre linhas
    """
    tam = len(msg) + 4
    print(c[cor], end='')
    print('~' * tam)
    print(f'  {msg}')
    print('~' * tam)
    print(c[0], end='')


def ajuda(txt):
    from time import sleep
    titulo(f'Acessando o manual do comando {txt}...', 4)
    sleep(1)
    print(c[5])
    help(txt)
    print(c[0])


# programa principal
comando = ''
while True:
    titulo("Sistema de Ajuda PyHelp", 2)
    comando = str(input('Função ou Biblioteca (FIM TERMINA) >  '))
    if comando.upper() == "FIM":
        break
    else:
        ajuda(comando)
titulo('ATÉ LOGO!', 1)
