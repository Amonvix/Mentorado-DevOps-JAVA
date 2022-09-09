from time import sleep


def linha():
    print('-=' * 30)


def maior(* num):
    linha()
    print('Analisando os valores informados... ')
    if num == str:
        num = 0
    for n in num:
        print(n, end=' ')
        sleep(.2)
    print(f'Foram informados {len(num)} valores ao todo. ')
    print(f'O maior valor informado é {max(num)}')


maior(2, 9, 4, 5, 7, 1)
maior(4, 7, 0)
maior(1, 2)
maior(6)
maior(0)
