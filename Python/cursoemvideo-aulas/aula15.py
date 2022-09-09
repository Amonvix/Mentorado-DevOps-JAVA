while True:
    resp = 'S'
    while resp in 'S':
        resp = str(input('Digite Sim ou Não [S/N]')).strip().upper()[0]
    else:
        break
print("terminou")